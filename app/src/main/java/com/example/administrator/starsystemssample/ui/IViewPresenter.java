package com.example.administrator.starsystemssample.ui;


import com.example.administrator.starsystemssample.adpters.ReCyclerViewAdapters;

/**
 * Created by Administrator on 3/22/2018.
 * <p>
 * View Presenter communicate with View from Model
 * Update adapter, hideProgress etc...
 */

public interface IViewPresenter {
    void updateUI(ReCyclerViewAdapters cyclerViewAdapters);

    void hideProgress();

    void updateEmptyView();


}
