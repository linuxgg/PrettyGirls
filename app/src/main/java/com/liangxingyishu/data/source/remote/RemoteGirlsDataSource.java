package com.liangxingyishu.data.source.remote;

import com.liangxingyishu.data.bean.GirlsBean;
import com.liangxingyishu.data.source.GirlsDataSource;
import com.liangxingyishu.http.GirlsRetrofit;
import com.liangxingyishu.http.GirlsService;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class RemoteGirlsDataSource implements GirlsDataSource {

    @Override
    public void getGirls(int page, int size, final LoadGirlsCallback callback) {
        GirlsRetrofit.getRetrofit()
                .create(GirlsService.class)
                .getGirls("福利", size, page+2)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GirlsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onDataNotAvailable();
                    }

                    @Override
                    public void onNext(GirlsBean girlsBean) {
                        callback.onGirlsLoaded(girlsBean);
                    }
                });
    }

    @Override
    public void getGirl(final LoadGirlsCallback callback) {
        getGirls(1, 1, callback);
    }
}
