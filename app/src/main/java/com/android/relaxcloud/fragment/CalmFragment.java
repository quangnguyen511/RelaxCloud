package com.android.relaxcloud.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.relaxcloud.R;
import com.android.relaxcloud.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalmFragment extends BaseFragment {


    public CalmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calm, container, false);
    }

}
