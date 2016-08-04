package com.liangxingyishu.home;

import com.liangxingyishu.BasePresenter;
import com.liangxingyishu.BaseView;
import com.liangxingyishu.data.bean.GirlsBean;

import java.util.List;


public interface GirlsContract {

    interface View extends BaseView {
        void refresh(List<GirlsBean.ResultsEntity> datas);

        void load(List<GirlsBean.ResultsEntity> datas);

        void showError();

        void showNormal();
    }

    interface Presenter extends BasePresenter {
        void getGirls(int page, int size, boolean isRefresh);
    }
}
