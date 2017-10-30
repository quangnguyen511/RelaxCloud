package com.android.relaxcloud.base;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.android.relaxcloud.R;

/**
 * Created by DangQuang on 10/27/17.
 **/

public abstract class BaseActivity extends AppCompatActivity {

    private void addReplaceFragment(BaseFragment fragment, boolean isReplace, boolean isAddToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null && fragment != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if (isReplace)
                fragmentTransaction.replace(R.id.actMain_frmContainer, fragment);
            else
                fragmentTransaction.add(R.id.actMain_frmContainer, fragment, fragment.getClass().getSimpleName());
            if (isAddToBackStack) {
                fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
            }
            fragmentTransaction.commit();
        }
    }

    public void replaceFragment(BaseFragment fragment, boolean isAddToBackStack) {

        addReplaceFragment(fragment, true, isAddToBackStack);
    }

    public void addFragment(BaseFragment fragment, boolean isAddToBackStack) {
        addReplaceFragment(fragment, false, isAddToBackStack);
    }
}
