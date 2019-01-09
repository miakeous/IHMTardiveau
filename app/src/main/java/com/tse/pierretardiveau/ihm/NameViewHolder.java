package com.tse.pierretardiveau.ihm;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NameViewHolder  extends RecyclerView.ViewHolder {

    @BindView(R.id.item_name_textview) TextView textViewName;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setContent(String name){
        textViewName.setText(name);
    }
}
