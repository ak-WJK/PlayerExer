package com.atguigu.playerexer.app;

import android.app.Application;
import android.content.Context;

import com.atguigu.playerexer.utlis.LogUtils;

import org.xutils.x;

/**
 * Created by Administrator on 2017/5/30.
 */

public class MyApplication extends Application {
    public static Context mContext;
    private LogUtils.Builder builder;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        x.Ext.init(this);
        x.Ext.setDebug(true);//是否输出日志

        builder = new LogUtils.Builder()
                .setLogSwitch(true)
                .setBorderSwitch(true)
                .setLog2FileSwitch(false)
                .setGlobalTag("TAG")
                .setLogFilter(LogUtils.V);


    }
}
