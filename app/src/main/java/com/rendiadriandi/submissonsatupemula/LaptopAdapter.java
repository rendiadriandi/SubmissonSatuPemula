package com.rendiadriandi.submissonsatupemula;

import android.content.Context;
import android.content.Intent;
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

    Context context;
    private ArrayList<Laptop> listLaptop;

    public LaptopAdapter(Context c, ArrayList<Laptop> list){
        this.context = c;
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
        final Laptop laptop = listLaptop.get(position);
        final String name, detail;
        final int photo;

        name = laptop.getName();
        detail = laptop.getDetail();
        photo = laptop.getPhoto();

        Glide.with(holder.itemView.getContext())
                .load(photo)
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(name);
        holder.tvDetail.setText(detail);

        //unutk klik
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("i_photo", photo);
                i.putExtra("i_name", name);
                i.putExtra("i_detail", detail);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
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
