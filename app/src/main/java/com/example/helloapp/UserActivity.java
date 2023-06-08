package com.example.helloapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    EditText nameBox;
    EditText yearBox;
    Button delButton;
    Button saveButton;

    DatabaseHelper sqlHelper;
    private DatabaseAdapter adapter;
    SQLiteDatabase db;
    Cursor userCursor;
    long userId=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

//        nameBox = findViewById(R.id.name);
//        yearBox = findViewById(R.id.year);
//        delButton = findViewById(R.id.deleteButton);
//        saveButton = findViewById(R.id.saveButton);
//
//        sqlHelper = new DatabaseHelper(this);
//        db = sqlHelper.getWritableDatabase();
//
//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            userId = extras.getLong("id");
//        }
//        // если 0, то добавление
//        if (userId > 0) {
//            // получаем элемент по id из бд
//            userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE + " where " +
//                    DatabaseHelper.COLUMN_ID + "=?", new String[]{String.valueOf(userId)});
//            userCursor.moveToFirst();
//            nameBox.setText(userCursor.getString(1));
//            yearBox.setText(String.valueOf(userCursor.getInt(2)));
//            userCursor.close();
//        } else {
//            // скрываем кнопку удаления
//            delButton.setVisibility(View.GONE);
//        }
//    }
//
//    public void save(View view){
//        ContentValues cv = new ContentValues();
//        cv.put(DatabaseHelper.COLUMN_NAME, nameBox.getText().toString());
//        cv.put(DatabaseHelper.COLUMN_YEAR, Integer.parseInt(yearBox.getText().toString()));
//
//        if (userId > 0) {
//            db.update(DatabaseHelper.TABLE, cv, DatabaseHelper.COLUMN_ID + "=" + userId, null);
//        } else {
//            db.insert(DatabaseHelper.TABLE, null, cv);
//        }
//        goHome();
//    }
//    public void delete(View view){
//        db.delete(DatabaseHelper.TABLE, "_id = ?", new String[]{String.valueOf(userId)});
//        goHome();
//    }
//    private void goHome(){
//        // закрываем подключение
//        db.close();
//        // переход к главной activity
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        startActivity(intent);
//    }


//        nameBox = findViewById(R.id.name);
//        yearBox = findViewById(R.id.year);
//        delButton = findViewById(R.id.deleteButton);
//        saveButton = findViewById(R.id.saveButton);
//
//        sqlHelper = new DatabaseHelper(this);
//        db = sqlHelper.open();
//
//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            userId = extras.getLong("id");
//        }
//        // если 0, то добавление
//        if (userId > 0) {
//            // получаем элемент по id из бд
//            userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE + " where " +
//                    DatabaseHelper.COLUMN_ID + "=?", new String[]{String.valueOf(userId)});
//            userCursor.moveToFirst();
//            nameBox.setText(userCursor.getString(1));
//            yearBox.setText(String.valueOf(userCursor.getInt(2)));
//            userCursor.close();
//        } else {
//            // скрываем кнопку удаления
//            delButton.setVisibility(View.GONE);
//        }
//    }
//    public void save(View view){
//        ContentValues cv = new ContentValues();
//        cv.put(DatabaseHelper.COLUMN_NAME, nameBox.getText().toString());
//        cv.put(DatabaseHelper.COLUMN_YEAR, Integer.parseInt(yearBox.getText().toString()));
//
//        if (userId > 0) {
//            db.update(DatabaseHelper.TABLE, cv, DatabaseHelper.COLUMN_ID + "=" + userId, null);
//        } else {
//            db.insert(DatabaseHelper.TABLE, null, cv);
//        }
//        goHome();
//    }
//    public void delete(View view){
//        db.delete(DatabaseHelper.TABLE, "_id = ?", new String[]{String.valueOf(userId)});
//        goHome();
//    }
//    private void goHome(){
//        // закрываем подключение
//        db.close();
//        // переход к главной activity
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        startActivity(intent);
//    }


        nameBox = findViewById(R.id.name);
        yearBox = findViewById(R.id.year);
        delButton = findViewById(R.id.deleteButton);
        adapter = new DatabaseAdapter(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            userId = extras.getLong("id");
        }
        // если 0, то добавление
        if (userId > 0) {
            // получаем элемент по id из бд
            adapter.open();
            User user = adapter.getUser(userId);
            nameBox.setText(user.getName());
            yearBox.setText(String.valueOf(user.getYear()));
            adapter.close();
        } else {
            // скрываем кнопку удаления
            delButton.setVisibility(View.GONE);
        }
    }

    public void save(View view){

        String name = nameBox.getText().toString();
        int year = Integer.parseInt(yearBox.getText().toString());
        User user = new User(userId, name, year);

        adapter.open();
        if (userId > 0) {
            adapter.update(user);
        } else {
            adapter.insert(user);
        }
        adapter.close();
        goHome();
    }
    public void delete(View view){

        adapter.open();
        adapter.delete(userId);
        adapter.close();
        goHome();
    }
    private void goHome(){
        // переход к главной activity
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}