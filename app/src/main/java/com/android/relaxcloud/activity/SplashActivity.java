package com.android.relaxcloud.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.IntentCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.android.relaxcloud.R;
import com.android.relaxcloud.adapter.IntroAdapter;
import com.android.relaxcloud.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashActivity extends BaseActivity implements ViewPager.OnPageChangeListener {

    @BindView(R.id.actSplash_tlIndicator)
    TabLayout tlIndicator;
    @BindView(R.id.actSplash_vpIntro)
    ViewPager vpIntro;
    @BindView(R.id.actSplash_tvExplore)
    TextView tvExplore;

    @SuppressLint("WrongConstant")
    public static void toMain(Context context) {
        Intent intent = new Intent().setClass(context,
                MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        initialize();
    }

    private void initialize() {
        IntroAdapter introAdapter = new IntroAdapter(getSupportFragmentManager());
        vpIntro.setAdapter(introAdapter);
        vpIntro.setOffscreenPageLimit(4);
        tlIndicator.setupWithViewPager(vpIntro,true);
        vpIntro.addOnPageChangeListener(this);
    }

    private void animateSlideUp() {
        tvExplore.setVisibility(View.VISIBLE);
        Animation animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        tvExplore.startAnimation(animSlideUp);
    }

    @OnClick(R.id.actSplash_tvExplore)
    void onViewClicked() {
        toMain(getApplicationContext());
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (position == 3)
            animateSlideUp();
        else
            tvExplore.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}