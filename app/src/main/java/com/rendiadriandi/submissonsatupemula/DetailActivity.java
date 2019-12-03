package com.rendiadriandi.submissonsatupemula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        final ImageView imageView = (ImageView) findViewById(R.id.toolbarImageDetail);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingTollbarDetail);
        final TextView tvName = (TextView) findViewById(R.id.tv_laptop_name);
        final TextView tvOverview = (TextView) findViewById(R.id.tv_laptop_overview);

        Intent i = getIntent();
        String name = i.getStringExtra("i_name");
        String detail = i.getStringExtra("i_detail");
        int photo = i.getIntExtra("i_photo", 0);

        collapsingToolbarLayout.setTitle(name);
        tvName.setText(name);
        tvOverview.setText(detail);
        Glide.with(this)
                .load(photo)
                .placeholder(R.drawable.ic_image_holder)
                .into(imageView);

    }
}
