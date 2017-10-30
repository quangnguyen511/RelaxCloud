package com.android.relaxcloud.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.android.relaxcloud.R;
import com.android.relaxcloud.base.BaseFragment;
import com.android.relaxcloud.others.Constant;
import com.android.relaxcloud.utils.KeyCommandUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class SoundListFragment extends BaseFragment {

    @BindView(R.id.fragmentSoundList_rvSounds)
    RecyclerView rvSounds;
    @BindView(R.id.fragmentSoundList_frmBackground)
    FrameLayout frmBackground;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sound_list, container, false);
        ButterKnife.bind(this, view);
        initialize();
        return view;
    }

    private void initialize() {
        int position = getArguments().getInt(KeyCommandUtils.key_position);
        rvSounds.setLayoutManager(new LinearLayoutManager(getContext()));
        switch (position) {
            case Constant.CALM_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.orange));
                break;
            case Constant.SLEEP_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.pink));
                break;
            case Constant.COFFEE_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.violet));
                break;
            case Constant.NATURE_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.light_blue));
                break;
            case Constant.FOCUS_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.green));
                break;
        }
    }
}
