package com.tse.pierretardiveau.ihm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {
    List<String> nameList;

    public NameAdapter() {
        this.nameList = new ArrayList<>();
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
        holder.setContent(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void updateList(List<String> nameList) {
        this.nameList.clear();
        this.nameList.addAll(nameList);
        notifyDataSetChanged();
    }
}
