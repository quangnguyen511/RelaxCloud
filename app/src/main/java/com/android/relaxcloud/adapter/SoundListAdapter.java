package com.android.relaxcloud.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.relaxcloud.R;
import com.android.relaxcloud.interfaces.ItemListener;
import com.android.relaxcloud.model.SoundModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DangQuang on 10/30/17.
 **/

public class SoundListAdapter extends RecyclerView.Adapter<SoundListAdapter.SoundHolder> {

    private ArrayList<SoundModel> mSounds;
    private ItemListener listener;

    public SoundListAdapter(ArrayList<SoundModel> mSounds) {
        this.mSounds = mSounds;
    }

    public void setListener(ItemListener listener) {
        this.listener = listener;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SoundHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sound, parent, false));
    }

    @Override
    public void onBindViewHolder(final SoundHolder holder, int position) {
        SoundModel mSound = mSounds.get(position);
        holder.tvTitle.setText(mSound.getTitle());
        holder.tvDuration.setText(mSound.getDuration());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSounds != null ? mSounds.size() : 0;
    }

    static class SoundHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.itemSound_tvDuration)
        TextView tvDuration;
        @BindView(R.id.itemSound_tvTitle)
        TextView tvTitle;

        SoundHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
