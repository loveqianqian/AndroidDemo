package com.myloverqian.androiddemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.myloverqian.androiddemo.Presenter.Impl.MainPresenter;
import com.myloverqian.androiddemo.R;
import com.myloverqian.androiddemo.View.MainView;
import com.myloverqian.androiddemo.bean.WeatherDataBean;

/**
 * Created by 刁志伟 on 2017/3/30.
 * github ：https://github.com/loveqianqian
 */
public class MainActivity extends ActivitySkeleton<MainPresenter> implements MainView {

    private TextView textView;
    private Button getWeatherButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.main_tv);
        getWeatherButton = (Button) findViewById(R.id.btn_get);
        getWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void getDataSuccess(WeatherDataBean bean) {
        dataSuccess(bean);
    }

    @Override
    public void getDataFailure(String msg) {
        showToast("加载失败...", Toast.LENGTH_SHORT);
    }

    private void dataSuccess(WeatherDataBean bean) {
        WeatherDataBean.ResultBean.DataBean.RealtimeBean realtime = bean.getResult().getData().getRealtime();
        String result = realtime.getCity_name() + realtime.getWeather().getTemperature();
        textView.setText(result);
    }
}
