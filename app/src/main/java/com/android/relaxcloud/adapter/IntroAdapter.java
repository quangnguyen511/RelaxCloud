package com.android.relaxcloud.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.relaxcloud.fragment.IntroFragment;
import com.android.relaxcloud.utils.KeyCommandUtils;

/**
 * Created by DangQuang on 10/28/17.
 **/

public class IntroAdapter extends FragmentPagerAdapter {

    private static final int NUM_PAGE = 4;

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        IntroFragment introFragment = new IntroFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KeyCommandUtils.key_position, position);
        introFragment.setArguments(bundle);
        return introFragment;
    }

    @Override
    public int getCount() {
        return NUM_PAGE;
    }
}
