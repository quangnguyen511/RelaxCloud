package com.android.relaxcloud.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.android.relaxcloud.R;
import com.android.relaxcloud.adapter.IntroAdapter;
import com.android.relaxcloud.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity {

    @BindView(R.id.actSplash_tlIndicator)
    TabLayout tlIndicator;
    @BindView(R.id.actSplash_vpIntro)
    ViewPager vpIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        IntroAdapter introAdapter = new IntroAdapter(getSupportFragmentManager());
        vpIntro.setAdapter(introAdapter);
        vpIntro.setOffscreenPageLimit(4);
        tlIndicator.setupWithViewPager(vpIntro,true);
    }
}