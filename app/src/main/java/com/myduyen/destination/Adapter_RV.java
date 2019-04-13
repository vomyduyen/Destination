package com.myduyen.destination;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class Adapter_RV extends RecyclerView.Adapter<Adapter_RV.MyViewHolder> {
    private List<RV> rvList;
    private LayoutInflater layoutInflater;
    private Context ct;

    public Adapter_RV(List<RV> rvList, Context ct) {
        this.rvList = rvList;
        this.ct = ct;
        this.layoutInflater=LayoutInflater.from(ct);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = layoutInflater.inflate(R.layout.item,parent,false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(Adapter_RV.MyViewHolder holder, int position) {
        RV destination  = rvList.get(position);
        holder.anh.setImageResource(destination.getAnh());
        holder.ten.setText(destination.getTen());
        holder.dc.setText(destination.getDc());
        holder.review.setText(destination.getReview());
        holder.latitude.setText(" "+destination.getLatitude());
        holder.longtitude.setText(" "+destination.getLongtitude());


    }

    public void setRvList(List<RV> rvList) {
        this.rvList = rvList;
    }

    public List<RV> getRvList() {
        return rvList;
    }
    @Override
    public int getItemCount() {
        return rvList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView anh;
        public TextView ten,dc,review;
        public TextView longtitude,latitude;

        public MyViewHolder(final View itemView) {
            super(itemView);
            anh=(ImageView)itemView.findViewById(R.id.img);
            ten=(TextView)itemView.findViewById(R.id.tv1);
            dc=(TextView)itemView.findViewById(R.id.tvdc);
            review=(TextView)itemView.findViewById(R.id.review);
            longtitude=(TextView)itemView.findViewById(R.id.longtitude);
            latitude=(TextView)itemView.findViewById(R.id.latitude);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      Intent i = new Intent(ct,Main2Activity.class);
                    int vitri = getAdapterPosition();
                    i.putExtra("anh",rvList.get(vitri).getAnh());
                   i.putExtra("ten",rvList.get(vitri).getTen());
                    i.putExtra("dc",rvList.get(vitri).getDc());
                    i.putExtra("review",rvList.get(vitri).getReview());
                    i.putExtra("longtitude",rvList.get(vitri).getLongtitude());
                    i.putExtra("latitude",rvList.get(vitri).getLatitude());
                    ct.startActivity(i);

                }
            });

        }
    }
}
