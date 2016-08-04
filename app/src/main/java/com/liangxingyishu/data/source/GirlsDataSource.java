package com.liangxingyishu.data.source;

import com.liangxingyishu.data.bean.GirlsBean;


public interface GirlsDataSource {

    interface LoadGirlsCallback {

        void onGirlsLoaded(GirlsBean girlsBean);

        void onDataNotAvailable();
    }

    void getGirls(int page, int size, LoadGirlsCallback callback);

    void getGirl(LoadGirlsCallback callback);
}
