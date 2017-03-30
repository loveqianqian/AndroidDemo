package com.myloverqian.androiddemo.Model.Impl;

import com.myloverqian.androiddemo.Model.IMainModel;
import com.myloverqian.androiddemo.Presenter.IMainPresenter;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */
public class MainModel implements IMainModel {

    private IMainPresenter mainPresenter;

    public MainModel(IMainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @Override
    public void loadData() {

    }

}
