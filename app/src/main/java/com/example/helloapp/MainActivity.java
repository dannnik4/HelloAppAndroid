package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cooper);

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragment_container_view, ContentFragment.class, null)
//                    .commit();
//        }


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        TextView headerView = findViewById(R.id.selectedMenuItem);
//        switch(id){
//            case R.id.action_settings :
//                headerView.setText("Настройки");
//                return true;
//            case R.id.open_settings:
//                headerView.setText("Открыть");
//                return true;
//            case R.id.save_settings:
//                headerView.setText("Сохранить");
//                return true;
//        }
//        //headerView.setText(item.getTitle());
//        return super.onOptionsItemSelected(item);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        super.onCreateOptionsMenu(menu);
//        menu.add("Настройки");
//        menu.add("Открыть");
//        menu.add("Сохранить");
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        String title = item.getTitle().toString();
//        TextView headerView = findViewById(R.id.selectedMenuItem);
//        headerView.setText(title);
//
//        return super.onOptionsItemSelected(item);
//    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        TextView headerView = findViewById(R.id.selectedMenuItem);
//        switch(id){
//            case R.id.action_settings :
//                headerView.setText("Настройки");
//                return true;
//            case R.id.open_settings:
//                headerView.setText("Открыть");
//                return true;
//            case R.id.save_settings:
//                headerView.setText("Сохранить");
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0        // Группа
                ,1        // id
                ,0        //порядок
                ,"Создать");  // заголовок

        menu.add(0,2,1,"Открыть");
        menu.add(0,3,2,"Сохранить");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);

        switch(id){
            case 1 :
                headerView.setText("Создать документ");
                return true;
            case 2:
                headerView.setText("Открыть документ");
                return true;
            case 3:
                headerView.setText("Сохранить документ");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSendData(String selectedItem) {
        DetailFragment fragment = (DetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);
        if (fragment != null)
            fragment.setSelectedItem(selectedItem);
    }

}