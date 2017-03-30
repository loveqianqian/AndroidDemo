package com.myloverqian.androiddemo.Presenter;

import com.myloverqian.androiddemo.bean.WeatherDataBean;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */

public interface IMainPresenter {

    void loadDataSuccess(WeatherDataBean bean);

    void loadDataFailure();
}
