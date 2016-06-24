package com.yangbo.maoyan.fragment;

import android.view.View;

import com.yangbo.maoyan.R;
import com.yangbo.maoyan.base.BaseFragment;

/**
 * Created by yangbo on 2016/6/22.
 */
public class CinemaFragment extends BaseFragment {


    public CinemaFragment( ) {
        super();
    }

    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_cinema,null);
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();

    }
}
