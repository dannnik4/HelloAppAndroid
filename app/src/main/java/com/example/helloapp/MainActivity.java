package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //int currentValue = 0;

    int[] integers=null;
    int clicks = 0;
    ProgressBar indicatorBar;
    TextView statusView;
    TextView clicksView;
    Button progressBtn;
    Button clicksBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asynctask_layout);

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


        integers = new int[100];
        for(int i=0;i<100;i++) {
            integers[i] = i + 1;
        }
        indicatorBar = (ProgressBar) findViewById(R.id.indicator);
        statusView = findViewById(R.id.statusView);
        progressBtn = findViewById(R.id.progressBtn);
        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new ProgressTask().execute();
            }
        });

        clicksView = findViewById(R.id.clicksView);
        clicksBtn = findViewById(R.id.clicksBtn);
        clicksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicks++;
                clicksView.setText("Clicks: " + clicks);
            }
        });
    }

    class ProgressTask extends AsyncTask<Void, Integer, Void> {
        @Override
        protected Void doInBackground(Void... unused) {
            for (int i = 0; i<integers.length;i++) {

                publishProgress(i);
                SystemClock.sleep(400);
            }
            return(null);
        }
        @Override
        protected void onProgressUpdate(Integer... items) {
            indicatorBar.setProgress(items[0]+1);
            statusView.setText("Статус: " + String.valueOf(items[0]+1));
        }
        @Override
        protected void onPostExecute(Void unused) {
            Toast.makeText(getApplicationContext(), "Задача завершена", Toast.LENGTH_SHORT)
                    .show();
        }

    }
}