package com.myloverqian.androiddemo.View;

import com.myloverqian.androiddemo.bean.WeatherDataBean;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */
public interface MainView extends BaseView {

    void getDataSuccess(WeatherDataBean bean);

    void getDataFailure(String msg);
}
