package com.example.administrator.starsystemssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.administrator.starsystemssample.ui.PageListFragment;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //add fragment to Main activity
        addFragment();
    }

    /*
    *
    * Create Fragment instance
    * add the fragment to that container using getSupport fragment manager
    *
    * */

    private void addFragment() {
        PageListFragment pageListFragment = new PageListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, pageListFragment, pageListFragment.TAG)
                .commit();
    }


}
