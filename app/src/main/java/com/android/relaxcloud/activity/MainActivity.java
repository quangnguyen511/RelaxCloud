package com.android.relaxcloud.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.relaxcloud.R;
import com.android.relaxcloud.adapter.MenuAdapter;
import com.android.relaxcloud.base.BaseActivity;
import com.android.relaxcloud.interfaces.ItemListener;
import com.android.relaxcloud.model.MenuModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements ItemListener {

    @BindView(R.id.actMain_rvMenu)
    RecyclerView rvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<MenuModel> mMenus = new ArrayList<>();
        mMenus.add(new MenuModel(R.drawable.ic_calm, "Calm Sound","#F3BB72"));
        mMenus.add(new MenuModel(R.drawable.ic_sleep, "Sleep Sound","#FF85A7"));
        mMenus.add(new MenuModel(R.drawable.ic_coffee, "Coffee Shop Sound","#EE82EE"));
        mMenus.add(new MenuModel(R.drawable.ic_nature, "Nature Sound","#7BECED"));
        mMenus.add(new MenuModel(R.drawable.ic_work, "Focus Sound", "#B1DC76"));

        MenuAdapter menuAdapter = new MenuAdapter(mMenus);
        rvMenu.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvMenu.setAdapter(menuAdapter);
        menuAdapter.setListener(this);
    }

    @Override
    public void onItemClicked(int pos) {
        switch (pos){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
