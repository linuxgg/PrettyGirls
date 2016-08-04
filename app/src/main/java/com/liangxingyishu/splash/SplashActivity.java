package com.liangxingyishu.splash;

import android.view.View;

import com.liangxingyishu.R;

import com.liangxingyishu.base.AppActivity;
import com.liangxingyishu.base.BaseFragment;

public class SplashActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return SplashFragment.getInstance();
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.splash_fragment;
    }

    @Override
    public void onClick(View v) {

    }
}
