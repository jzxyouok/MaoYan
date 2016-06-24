package com.yangbo.maoyan.pager;

import android.content.Context;
import android.view.View;

import com.yangbo.maoyan.R;
import com.yangbo.maoyan.base.BasePager;

/**
 * Created by yangbo on 2016/6/22.
 */
public class DaiYingPager extends BasePager {

    public DaiYingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.fragment_daiying,null);
        return view;
    }
}
