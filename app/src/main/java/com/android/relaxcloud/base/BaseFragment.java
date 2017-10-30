package com.android.relaxcloud.base;

import android.support.v4.app.Fragment;

/**
 * Created by DangQuang on 10/29/17.
 **/

public class BaseFragment extends Fragment {
    public void replaceFragment(BaseFragment fragment, boolean isAddToBackStack) {
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).replaceFragment(fragment, isAddToBackStack);
        }
    }

    public void addFragment(BaseFragment fragment, boolean isAddToBackStack) {
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).addFragment(fragment, isAddToBackStack);
        }
    }
}
