package com.myloverqian.androiddemo.Presenter;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */

public abstract class PresenterSkeleton<V> {

    private V view;

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        this.view = null;
    }

}
