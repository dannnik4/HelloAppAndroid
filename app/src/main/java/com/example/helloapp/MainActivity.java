package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.FrameLayout;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);

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

        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.VERTICAL);
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // установка layout_gravity
        //layoutParams.gravity = Gravity.CENTER;
        // первое текстовое поле
        //TextView textView1 = new TextView(this);
        //textView1.setText("Hello");
        //textView1.setTextSize(30);
        //linearLayout.addView(textView1, layoutParams);
        //setContentView(linearLayout);


        //RelativeLayout relativeLayout = new RelativeLayout(this);

        //EditText editText = new EditText(this);
        //editText.setId(EditText.generateViewId());

        //Button button = new Button(this);
        //button.setText("Отправить");

        // устанавливаем параметры положения для EditText
        //RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.MATCH_PARENT,
        //        RelativeLayout.LayoutParams.WRAP_CONTENT
        //);
        // выравнивание по центру родительского контейнера
        //editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        // добавляем в RelativeLayout
        //relativeLayout.addView(editText, editTextParams);

        // устанавливаем параметры положения для Button
        //RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.WRAP_CONTENT,
        //        RelativeLayout.LayoutParams.WRAP_CONTENT
        //);
        // выравнивание справа и снизу от поля EditText
        //buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
        //buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
        // добавляем в RelativeLayout
        //relativeLayout.addView(button, buttonParams);

        //setContentView(relativeLayout);


        //TableLayout tableLayout = new TableLayout( this);

        // первая строка
        //TableRow tableRow1 = new TableRow(this);

        //TextView textView1 = new TextView(this);
        //textView1.setText("Логин");
        //tableRow1.addView(textView1, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        //EditText editText1 = new EditText(this);
        //tableRow1.addView(editText1, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));

        // вторая строка
        //TableRow tableRow2 = new TableRow(this);

        //TextView textView2 = new TextView(this);
        //textView2.setText("Email");
        //tableRow2.addView(textView2, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        //EditText editText2 = new EditText(this);
        //tableRow2.addView(editText2, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.f));

        //tableLayout.addView(tableRow1);
        //tableLayout.addView(tableRow2);
        //setContentView(tableLayout);


        //FrameLayout frameLayout = new FrameLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello World!");

        //FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams
        //        (FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;

        //textView.setLayoutParams(layoutParams);
        //textView.setTextSize(26);
        //frameLayout.addView(textView);
        //setContentView(frameLayout);


        GridLayout gridLayout = new GridLayout( this);
        // количество строк
        gridLayout.setRowCount(3);
        // количество столбцов
        gridLayout.setColumnCount(3);

        //for(int i = 1; i <=9; i++){
        //    Button btn = new Button(this);
        //    btn.setText(String.valueOf(i));
        //    gridLayout.addView(btn);
        //}

        for(int i = 1; i <=3; i++){
            Button btn = new Button(this);
            btn.setText(String.valueOf(i));
            gridLayout.addView(btn);
        }

        Button btn4 = new Button(this);
        btn4.setText("4");
        GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
        layoutParams4.columnSpec = GridLayout.spec(0,2);
        layoutParams4.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics());
        gridLayout.addView(btn4, layoutParams4);


        Button btn5 = new Button(this);
        btn5.setText("5");
        GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
        layoutParams5.rowSpec = GridLayout.spec(1,2);
        layoutParams5.height = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
        gridLayout.addView(btn5, layoutParams5);

        Button btn6 = new Button(this);
        btn6.setText("6");
        Button btn7 = new Button(this);
        btn7.setText("7");
        gridLayout.addView(btn6);
        gridLayout.addView(btn7);

        setContentView(gridLayout);
    }
}