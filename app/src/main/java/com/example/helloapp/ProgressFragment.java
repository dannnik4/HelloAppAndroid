package com.example.helloapp;

import android.os.AsyncTask;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class ProgressFragment extends Fragment {

    int[] integers=null;
    ProgressBar indicatorBar;
    TextView statusView;

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_progress, container, false);
//
//        ProgressBar indicatorBar = (ProgressBar) view.findViewById(R.id.indicator);
//        TextView statusView = (TextView) view.findViewById(R.id.statusView);
//        Button btnFetch = (Button)view.findViewById(R.id.progressBtn);
//
//        MyViewModel model = new ViewModelProvider(requireActivity()).get(MyViewModel.class);
//
//        model.getValue().observe(getViewLifecycleOwner(), value -> {
//            indicatorBar.setProgress(value);
//            statusView.setText("Статус: " + value);
//        });
//        btnFetch.setOnClickListener(v -> model.execute());
//        return view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progres, container, false);
        integers = new int[100];
        for(int i=0;i<100;i++) {
            integers[i] = i + 1;
        }
        indicatorBar = (ProgressBar) view.findViewById(R.id.indicator);
        statusView = (TextView) view.findViewById(R.id.statusView);
        Button btnFetch = (Button)view.findViewById(R.id.progressBtn);
        btnFetch.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                new ProgressTask().execute();
            }
        });
        return view;
    }

    class ProgressTask extends AsyncTask<Void, Integer, Void> {
        @Override
        protected Void doInBackground(Void... unused) {
            for (int i = 0; i<integers.length;i++) {

                publishProgress(i);
                SystemClock.sleep(400);
            }
            return null;
        }
        @Override
        protected void onProgressUpdate(Integer... items) {
            indicatorBar.setProgress(items[0]+1);
            statusView.setText("Статус: " + String.valueOf(items[0]+1));
        }
        @Override
        protected void onPostExecute(Void unused) {
            Toast.makeText(getActivity(), "Задача завершена", Toast.LENGTH_SHORT)
                    .show();
        }
    }
}