package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);

//        TextView textView = new TextView(this);
//        textView.setTextSize(20);
//        textView.setPadding(16, 16, 16, 16);
//        textView.setText("SecondActivity");
//        setContentView(textView);


//        TextView textView = new TextView(this);
//        textView.setTextSize(26);
//        textView.setPadding(16, 16, 16, 16);
//
//        Bundle arguments = getIntent().getExtras();
//
//        //if(arguments!=null){
//        //    String name = arguments.get("name").toString();
//        //    String company = arguments.getString("company");
//        //    int age = arguments.getInt("age");
//        //    textView.setText("Name: " + name + "\nCompany: " + company + "\nAge: " + age);
//        //}
//
//        User user;
//        if(arguments!=null){
//            user = (User) arguments.getSerializable(User.class.getSimpleName());
//
//            textView.setText("Name: " + user.getName() + "\nCompany: " + user.getCompany() +
//                    "\nAge: " + String.valueOf(user.getAge()));
//        }
//
//        setContentView(textView);


        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        User user;
        if(arguments!=null){
            user = arguments.getParcelable(User.class.getSimpleName());

            textView.setText("Name: " + user.getName() + "\nCompany: " + user.getCompany() +
                    "\nAge: " + String.valueOf(user.getAge()));
        }
        setContentView(textView);
    }
}