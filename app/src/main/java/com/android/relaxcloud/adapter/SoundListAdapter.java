package com.android.relaxcloud.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.relaxcloud.R;
import com.android.relaxcloud.model.SoundModel;

import java.util.ArrayList;

import butterknife.ButterKnife;

/**
 * Created by DangQuang on 10/30/17.
 **/

public class SoundListAdapter extends RecyclerView.Adapter<SoundListAdapter.SoundHolder> {

    private ArrayList<SoundModel> mSounds;

    public SoundListAdapter(ArrayList<SoundModel> mSounds) {
        this.mSounds = mSounds;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SoundHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sound, parent, false));
    }

    @Override
    public void onBindViewHolder(SoundHolder holder, int position) {
        SoundModel mSound = mSounds.get(position);

    }

    @Override
    public int getItemCount() {
        return mSounds != null ? mSounds.size() : 0;
    }

    static class SoundHolder extends RecyclerView.ViewHolder {
        SoundHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
