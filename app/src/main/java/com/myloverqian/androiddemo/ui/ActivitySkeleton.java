package com.myloverqian.androiddemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.myloverqian.androiddemo.Presenter.PresenterSkeleton;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */
public abstract class ActivitySkeleton<P extends PresenterSkeleton> extends BaseActivity {

    private P presenter;

    protected abstract P createPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        presenter = this.createPresenter();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
        }
    }

    public void showLoading() {
        showProgressDialog("正在加载...");
    }

    public void dismissLoading() {
        dismissProgressDialog();
    }
}
