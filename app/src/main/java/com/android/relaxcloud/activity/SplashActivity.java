package com.android.relaxcloud.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.relaxcloud.R;
import com.android.relaxcloud.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
