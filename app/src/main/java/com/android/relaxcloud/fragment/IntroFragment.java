package com.android.relaxcloud.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.relaxcloud.R;
import com.android.relaxcloud.utils.KeyCommandUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int position = getArguments().getInt(KeyCommandUtils.key_position);
        switch (position){
            case 0:
                return inflater.inflate(R.layout.fragment_intro, container, false);
            case 1:
                return inflater.inflate(R.layout.fragment_intro2,container,false);
            case 2:
                return inflater.inflate(R.layout.fragment_intro3,container,false);
            case 3:
                return inflater.inflate(R.layout.fragment_intro4,container,false);
        }
        return null;
    }

}
