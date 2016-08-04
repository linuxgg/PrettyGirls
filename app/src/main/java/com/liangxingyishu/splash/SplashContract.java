package com.liangxingyishu.splash;

import com.liangxingyishu.BasePresenter;
import com.liangxingyishu.BaseView;


public interface SplashContract {

    interface View extends BaseView<Presenter> {
        void showGirl(String girlUrl);

        void showGirl();
    }

    interface Presenter extends BasePresenter {

    }

}
