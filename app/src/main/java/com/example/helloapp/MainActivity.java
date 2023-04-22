package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //int currentValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentuse_layout);

//        TextView textView = findViewById(R.id.textView);
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Определяем объект Runnable
//                Runnable runnable = new Runnable() {
//                    @Override
//                    public void run() {
//                        // получаем текущее время
//                        Calendar c = Calendar.getInstance();
//                        int hours = c.get(Calendar.HOUR_OF_DAY);
//                        int minutes = c.get(Calendar.MINUTE);
//                        int seconds = c.get(Calendar.SECOND);
//                        String time = hours + ":" + minutes + ":" + seconds;
//                        // отображаем в текстовом поле
//                        textView.setText(time);
//                    }
//                };
//                // Определяем объект Thread - новый поток
//                Thread thread = new Thread(runnable);
//                // Запускаем поток
//                thread.start();
//            }
//        });

//        TextView textView = findViewById(R.id.textView);
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Определяем объект Runnable
//                Runnable runnable = new Runnable() {
//                    @Override
//                    public void run() {
//                        // получаем текущее время
//                        Calendar c = Calendar.getInstance();
//                        int hours = c.get(Calendar.HOUR_OF_DAY);
//                        int minutes = c.get(Calendar.MINUTE);
//                        int seconds = c.get(Calendar.SECOND);
//                        String time = hours + ":" + minutes + ":" + seconds;
//                        // отображаем в текстовом поле
//                        textView.post(new Runnable() {
//                            public void run() {
//                                textView.setText(time);
//                            }
//                        });
//                    }
//                };
//                // Определяем объект Thread - новый поток
//                Thread thread = new Thread(runnable);
//                // Запускаем поток
//                thread.start();
//            }
//        });


//        ProgressBar indicatorBar = findViewById(R.id.indicator);
//        TextView statusView = findViewById(R.id.statusView);
//        Button btnFetch = findViewById(R.id.progressBtn);
//        btnFetch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Runnable runnable = new Runnable() {
//                    @Override
//                    public void run() {
//
//                        for(; currentValue <= 100; currentValue++){
//                            try {
//                                statusView.post(new Runnable() {
//                                    public void run() {
//                                        indicatorBar.setProgress(currentValue);
//                                        statusView.setText("Статус: " + currentValue);
//                                    }
//                                });
//
//                                Thread.sleep(400);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                };
//                Thread thread = new Thread(runnable);
//                thread.start();
//            }
//        });

//        ProgressBar indicatorBar = findViewById(R.id.indicator);
//        TextView statusView = findViewById(R.id.statusView);
//        Button btnFetch = findViewById(R.id.progressBtn);
//        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
//
//        model.getValue().observe(this, value -> {
//            indicatorBar.setProgress(value);
//            statusView.setText("Статус: " + value);
//        });
//        btnFetch.setOnClickListener(v -> model.execute());
    }
}