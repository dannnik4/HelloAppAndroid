package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

//    // набор данных, которые свяжем со списком
//    String[] countries = {"Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};

    ArrayList<String> users = new ArrayList<String>();
    ArrayList<String> selectedUsers = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    ListView usersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrayadapter_layout);

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


//        // получаем элемент TextView
//        TextView selection = findViewById(R.id.selection);
//        // получаем элемент ListView
//        ListView countriesList = findViewById(R.id.countriesList);
//        // создаем адаптер
//        ArrayAdapter<String> adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, countries);
//        // устанавливаем для списка адаптер
//        countriesList.setAdapter(adapter);
//        // добавляем для списка слушатель
//        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
//            {
//                // по позиции получаем выбранный элемент
//                String selectedItem = countries[position];
//                // установка текста элемента TextView
//                selection.setText(selectedItem);
//            }
//        });

//        // получаем элемент TextView
//        TextView selection = findViewById(R.id.selection);
//        // получаем элемент ListView
//        ListView countriesList = findViewById(R.id.countriesList);
//        // создаем адаптер
//        // создаем адаптер
//        ArrayAdapter<String> adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_multiple_choice, countries);
//        // устанавливаем для списка адаптер
//        countriesList.setAdapter(adapter);
//        // добавляем для списка слушатель
//        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
//            {
//                SparseBooleanArray selected=countriesList.getCheckedItemPositions();
//
//                String selectedItems="";
//                for(int i=0;i < countries.length;i++)
//                {
//                    if(selected.get(i))
//                        selectedItems+=countries[i]+",";
//                }
//                // установка текста элемента TextView
//                selection.setText("Выбрано: " + selectedItems);
//            }
//        });


        // добавляем начальные элементы
        Collections.addAll(users, "Tom", "Bob", "Sam", "Alice");
        // получаем элемент ListView
        usersList = findViewById(R.id.usersList);
        // создаем адаптер
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, users);
        // устанавливаем для списка адаптер
        usersList.setAdapter(adapter);

        // обработка установки и снятия отметки в списке
        usersList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                // получаем нажатый элемент
                String user = adapter.getItem(position);
                if(usersList.isItemChecked(position))
                    selectedUsers.add(user);
                else
                    selectedUsers.remove(user);
            }
        });
    }

    public void add(View view){

        EditText userName = findViewById(R.id.userName);
        String user = userName.getText().toString();
        if(!user.isEmpty()){
            adapter.add(user);
            userName.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        // получаем и удаляем выделенные элементы
        for(int i=0; i< selectedUsers.size();i++){
            adapter.remove(selectedUsers.get(i));
        }
        // снимаем все ранее установленные отметки
        usersList.clearChoices();
        // очищаем массив выбраных объектов
        selectedUsers.clear();

        adapter.notifyDataSetChanged();

    }
}