package com.rendiadriandi.submissonsatupemula;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.ListViewHolder> {

    private ArrayList<Laptop> listLaptop;

    public LaptopAdapter(ArrayList<Laptop> list){
        this.listLaptop = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_laptop, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Laptop laptop = listLaptop.get(position);
        Glide.with(holder.itemView.getContext())
                .load(laptop.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(laptop.getName());
        holder.tvDetail.setText(laptop.getDetail());
    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_laptop);
            tvName = itemView.findViewById(R.id.tv_name_laptop);
            tvDetail = itemView.findViewById(R.id.tv_detail_laptop);
        }
    }
}
