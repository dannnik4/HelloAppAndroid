package com.example.helloapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    XmlPullParser xpp = getResources().getXml(R.xml.users);
    UserResourceParser parser = new UserResourceParser();
        if(parser.parse(xpp))
    {
        for(User prod: parser.getUsers()){
            Log.d("XML", prod.toString());
        }
    }
}
}