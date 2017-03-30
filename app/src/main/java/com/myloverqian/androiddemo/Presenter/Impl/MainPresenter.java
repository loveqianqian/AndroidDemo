package com.myloverqian.androiddemo.Presenter.Impl;

import com.myloverqian.androiddemo.Model.IMainModel;
import com.myloverqian.androiddemo.Model.Impl.MainModel;
import com.myloverqian.androiddemo.Presenter.IMainPresenter;
import com.myloverqian.androiddemo.Presenter.PresenterSkeleton;
import com.myloverqian.androiddemo.View.MainView;
import com.myloverqian.androiddemo.bean.WeatherDataBean;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */
public class MainPresenter extends PresenterSkeleton<MainView> implements IMainPresenter {

    private IMainModel mainModel;

    public MainPresenter(MainView mainView) {
        attachView(mainView);
        mainModel = new MainModel(this);
    }

    public void loadData() {
//        mainView.s
        mainModel.loadData();
    }


    @Override
    public void loadDataSuccess(WeatherDataBean bean) {

    }

    @Override
    public void loadDataFailure() {

    }
}
