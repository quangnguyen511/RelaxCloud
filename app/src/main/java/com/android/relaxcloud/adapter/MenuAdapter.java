package com.android.relaxcloud.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.relaxcloud.R;
import com.android.relaxcloud.interfaces.ItemListener;
import com.android.relaxcloud.model.MenuModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DangQuang on 10/28/17.
 **/

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuHolder> {

    private ArrayList<MenuModel> mMenus;
    private ItemListener listener;

    public MenuAdapter(ArrayList<MenuModel> mMenus) {
        this.mMenus = mMenus;
    }

    public void setListener(ItemListener listener) {
        this.listener = listener;
    }

    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MenuHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(final MenuHolder holder, int position) {
        MenuModel mMenu = mMenus.get(holder.getAdapterPosition());
        holder.imvImage.setImageResource(mMenu.getImage());
        holder.tvTitle.setText(mMenu.getTitle());
        holder.itemView.setBackgroundColor(Color.parseColor(mMenu.getColor()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mMenus != null ? mMenus.size() : 0;
    }

    class MenuHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.itemMenu_imvImage)
        ImageView imvImage;
        @BindView(R.id.itemMenu_tvTitle)
        TextView tvTitle;

        MenuHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
