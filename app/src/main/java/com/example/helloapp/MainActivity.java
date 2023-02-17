package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        // создание TextView
        //TextView textView = new TextView(this);
        // установка текста в TextView
        //textView.setText("Hello Android!");
        // установка высоты текста
        //textView.setTextSize(22);
        // установка визуального интерфейса для activity
        //setContentView(textView);


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello Android");
        //textView.setTextSize(26);

        // устанавливаем параметры размеров и расположение элемента
        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        // эквивалент app:layout_constraintLeft_toLeftOf="parent"
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        // эквивалент app:layout_constraintTop_toTopOf="parent"
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        // устанавливаем параметры для textView
        //textView.setLayoutParams(layoutParams);
        // добавляем TextView в ConstraintLayout
        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);

        //ConstraintLayout constraintLayout = new ConstraintLayout(this);


        //EditText editText = new EditText(this);
        //editText.setHint("Введите Email");
        //editText.setId(View.generateViewId());

        //Button button = new Button(this);
        //button.setText("Отправить");
        //button.setId(View.generateViewId());

        //ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.rightToLeft = button.getId();
        //editText.setLayoutParams(editTextLayout);
        //constraintLayout.addView(editText);

        //ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //buttonLayout.leftToRight = editText.getId();
        //buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //button.setLayoutParams(buttonLayout);
        //constraintLayout.addView(button);

        //setContentView(constraintLayout);


        //setContentView(R.layout.activity_main);
        //LinearLayout linearLayout = new LinearLayout(this);
        // горизонтальная ориентация
        //linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        //TextView textView = new TextView(this);
        //textView.setText("Hello");
        //textView.setTextSize(30);
        // создаем параметры позиционирования для элемента
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // устанавливаем отступы
        //layoutParams.setMargins(100, 100, 0, 0);
        //textView.setLayoutParams(layoutParams);
        // добавляем элемент в LinearLayout
        //linearLayout.addView(textView);

        //setContentView(linearLayout);


        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.VERTICAL);

        // первое текстовое поле
        //TextView textView1 = new TextView(this);
        //textView1.setText("Hello");
        //textView1.setTextSize(30);
        // textView1 имеет вес 3
        //linearLayout.addView(textView1, new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.MATCH_PARENT, 0, 3));

        // второе текстовое поле
        //TextView textView2 = new TextView(this);
        //textView2.setText("Android");
        //textView2.setBackgroundColor(0xFFBDBDBD);
        //textView2.setTextSize(30);
        // textView2 имеет вес 2
        //linearLayout.addView(textView2, new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.MATCH_PARENT, 0, 2));

        //setContentView(linearLayout);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // установка layout_gravity
        layoutParams.gravity = Gravity.CENTER;
        // первое текстовое поле
        TextView textView1 = new TextView(this);
        textView1.setText("Hello");
        textView1.setTextSize(30);
        linearLayout.addView(textView1, layoutParams);
        setContentView(linearLayout);

    }
}