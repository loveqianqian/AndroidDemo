package com.myloverqian.androiddemo.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.annotation.LayoutRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by 刁志伟 on 2017/3/31.
 * github ：https://github.com/loveqianqian
 */

public class BaseActivity extends AppCompatActivity {

    private Activity activity;

    private ProgressDialog progressDialog;

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        this.activity = this;
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        this.activity = this;
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        this.activity = this;
    }

    public ProgressDialog showProgressDialog(String showMsg){
        progressDialog=new ProgressDialog(activity);
        progressDialog.setMessage(showMsg);
        progressDialog.show();
        return progressDialog;
    }

    public void dismissProgressDialog( ){
        if (progressDialog!=null&&progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }

    public void showToast(String toastMsg,int showDuration){
        Toast.makeText(activity,toastMsg,showDuration).show();
    }

    public Snackbar showSnacekbar(View view, String snackBarMsg, int showSnackBar){
        return  Snackbar.make(view, snackBarMsg, showSnackBar);
    }
}
