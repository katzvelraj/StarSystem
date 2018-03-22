package com.example.administrator.starsystemssample.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.example.administrator.starsystemssample.R;
import com.example.administrator.starsystemssample.adpters.ReCyclerViewAdapters;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Administrator on 3/22/2018.
 * MVP Architecture Used here
 * 1. View for Rendering View and basic Validation
 * 2. Model for do Business Logic and Network Request
 * 3. ViewPresenter  used for communicate with "View from Model"
 * 4. ModelPresenter used for Communicate with "Model from View"
 */

public class PageListFragment extends Fragment implements IViewPresenter {
    public static String TAG = "PageListFragment";


    private IModelPresenter modelPresenter;

    // Initialize view Here
    @BindView(R.id.deviceListView)
    RecyclerView recyclerView;

    @BindView(R.id.progress)
    ProgressBar progressBar;

    @BindView(R.id.emptyView)
    TextView emptyView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize model
        modelPresenter = new PageModel(getActivity(), PageListFragment.this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_devicelist, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        progressBar.setVisibility(View.VISIBLE);

        //start parser for parsing Json File
        modelPresenter.startParsing();
    }

    /**
     * @param reCyclerViewAdapters Choose the Layout manager and get the instance and set to RecyclerView.
     *                             set the adapter in RecyclerView
     *                             Make the ProgressBar InVisible after Set the adapter
     */
    public void updateUI(ReCyclerViewAdapters reCyclerViewAdapters) {
        emptyView.setVisibility(View.GONE);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(reCyclerViewAdapters);
        hideProgress();
    }



    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }


    /**
     * Update Empty view when no data available
     */
    @Override
    public void updateEmptyView() {
        emptyView.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
        emptyView.setText(getActivity().getResources().getString(R.string.errorData));
    }
}
