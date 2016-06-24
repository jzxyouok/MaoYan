package com.yangbo.maoyan.fragment;

import android.view.View;
import android.widget.TextView;

import com.yangbo.maoyan.R;
import com.yangbo.maoyan.base.BaseFragment;

/**
 * Created by yangbo on 2016/6/22.
 */
public class FindFragment extends BaseFragment {
    private TextView tv;

    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_find,null);
        tv = (TextView) view.findViewById(R.id.tv);
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();
        tv.setText("发现主页");

    }
}
