package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private Mychronometer mychronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mychronometer= findViewById(R.id.chronometer1);
        //解耦了系统组件和普通组件
        //给它添加Activity的生命周期的监听 回调方法
        getLifecycle().addObserver(mychronometer);
    }
/*    //chronometer的业务逻辑和Activity的生命周期联系很相关
    @Override
    protected void onResume() {
        super.onResume();
        //设置一个基准时间
        //System是获得开机时间
        chronometer.setBase(SystemClock.elapsedRealtime()-elapsedTime);
        chronometer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //我第二次进来的当前时间 - 第一次进来的时间
        elapsedTime =  SystemClock.elapsedRealtime()-chronometer.getBase();
        chronometer.stop();
    }*/
}