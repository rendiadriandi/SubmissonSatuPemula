package com.rendiadriandi.submissonsatupemula;

import androidx.annotation.IntegerRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLaptop;
    private ArrayList<Laptop> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLaptop = findViewById(R.id.rv_laptop);
        rvLaptop.setHasFixedSize(true);

        list.addAll(LaptopData.getListData());
        showRecyclerList();

    }
    
    private void showRecyclerList() {
        rvLaptop.setLayoutManager(new LinearLayoutManager(this));
        LaptopAdapter laptopAdapter = new LaptopAdapter(getApplicationContext(), list);
        rvLaptop.setAdapter(laptopAdapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.biodata, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mn_about:
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
