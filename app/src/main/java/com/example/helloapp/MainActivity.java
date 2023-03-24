package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

//    // набор данных, которые свяжем со списком
//    String[] countries = {"Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stringarray_layout);

//        // получаем элемент ListView
//        ListView countriesList = findViewById(R.id.countriesList);
//
//        // создаем адаптер
//        ArrayAdapter<String> adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, countries);
//
//        // устанавливаем для списка адаптер
//        countriesList.setAdapter(adapter);


//        // получаем элемент ListView
//        ListView countriesList = findViewById(R.id.countriesList);
//
//        // получаем ресурс
//        String[] countries = getResources().getStringArray(R.array.countries);
//
//        // создаем адаптер
//        ArrayAdapter<String> adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, countries);
//
//        // устанавливаем для списка адаптер
//        countriesList.setAdapter(adapter);

    }
}