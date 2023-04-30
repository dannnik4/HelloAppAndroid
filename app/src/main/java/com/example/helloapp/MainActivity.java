package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String name ="undefined";
    final static String nameVariableKey = "NAME_VARIABLE";
    TextView nameView;
    User user = new User("undefined", 0);
    final static String userVariableKey = "USER_VARIABLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serializable_layout);

//        nameView = findViewById(R.id.nameView);
//    }
//
//    // сохранение состояния
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//
//        outState.putString(nameVariableKey, name);
//        super.onSaveInstanceState(outState);
//    }
//    // получение ранее сохраненного состояния
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//
//        name = savedInstanceState.getString(nameVariableKey);
//        nameView.setText(name);
//    }
//    public void saveName(View view) {
//
//        // получаем введенное имя
//        EditText nameBox = findViewById(R.id.nameBox);
//        //  сохраняем его в переменную name
//        name = nameBox.getText().toString();
//    }
//    public void getName(View view) {
//
//        //  выводим сохраненное имя
//        nameView.setText(name);
//    }

    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putSerializable(userVariableKey, user);
        super.onSaveInstanceState(outState);
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // получаем объект User в переменную
        user = (User)savedInstanceState.getSerializable(userVariableKey);
        TextView dataView = findViewById(R.id.dataView);
        dataView.setText("Name: " + user.getName() + " Age: " + user.getAge());
    }
    public void saveData(View view) {

        // получаем введенные данные
        EditText nameBox = findViewById(R.id.nameBox);
        EditText yearBox = findViewById(R.id.yearBox);
        String name = nameBox.getText().toString();
        int age = 0;  // значение по умолчанию, если пользователь ввел некорректные данные
        try{
            age = Integer.parseInt(yearBox.getText().toString());
        }
        catch (NumberFormatException ex){}
        user = new User(name, age);
    }
    public void getData(View view) {

        // получаем сохраненные данные
        TextView dataView = findViewById(R.id.dataView);
        dataView.setText("Name: " + user.getName() + " Age: " + user.getAge());
    }
}