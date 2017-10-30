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
import com.android.relaxcloud.adapter.SoundListAdapter;
import com.android.relaxcloud.base.BaseFragment;
import com.android.relaxcloud.interfaces.ItemListener;
import com.android.relaxcloud.model.SoundModel;
import com.android.relaxcloud.others.Constant;
import com.android.relaxcloud.utils.KeyCommandUtils;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class SoundListFragment extends BaseFragment implements ItemListener {

    @BindView(R.id.fragmentSoundList_rvSounds)
    RecyclerView rvSounds;
    @BindView(R.id.fragmentSoundList_frmBackground)
    FrameLayout frmBackground;

    private ArrayList<SoundModel> mSounds = new ArrayList<>();

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
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
        switch (position) {
            case Constant.CALM_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.orange));
                databaseReference.child("calm");
                break;
            case Constant.SLEEP_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.pink));
                databaseReference.child("sleep");
                break;
            case Constant.COFFEE_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.violet));
                databaseReference.child("coffee");
                break;
            case Constant.NATURE_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.light_blue));
                databaseReference.child("nature");
                break;
            case Constant.FOCUS_POS:
                frmBackground.setBackgroundColor(getResources().getColor(R.color.green));
                databaseReference.child("focus");
                break;
        }
        databaseReference.child("calm").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    SoundModel locationModel = data.getValue(SoundModel.class);
                    mSounds.add(locationModel);
                }
                setupList();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    private void setupList() {
        rvSounds.setLayoutManager(new LinearLayoutManager(getContext()));
        SoundListAdapter soundListAdapter = new SoundListAdapter(mSounds);
        rvSounds.setAdapter(soundListAdapter);
        soundListAdapter.setListener(this);
    }

    @Override
    public void onItemClicked(int pos) {

    }
}
