package com.qxf.opencvdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    static{
        if (OpenCVLoader.initDebug()) {
            Log.i(TAG, "static initializer: 配置成功");
        } else {
            Log.i(TAG, "static initializer: 配置失败");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
