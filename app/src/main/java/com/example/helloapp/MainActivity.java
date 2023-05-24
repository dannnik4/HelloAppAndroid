package com.example.helloapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        ViewPager2 pager = findViewById(R.id.pager);
        FragmentStateAdapter pageAdapter = new MyAdapter(this);
        pager.setAdapter(pageAdapter);
    }
}