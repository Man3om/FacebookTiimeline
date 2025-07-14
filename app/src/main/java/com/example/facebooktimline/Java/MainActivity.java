package com.example.facebooktimline.Java;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktimline.Java.Adapter.TimelineAdapter;
import com.example.facebooktimline.Java.Adapter.TimlineListDM;
import com.example.facebooktimline.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<TimlineListDM> timelineList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreatesTimelineList();
        setupRecyclerView();
    }

    private void CreatesTimelineList() {
        Log.i(TAG, "CreatesTimelineList: ");
        timelineList = new ArrayList<>();

        timelineList.add(new TimlineListDM("Ahmed","3hrs","Helllo"));
        timelineList.add(new TimlineListDM("Ali","18hrs","Wordlkfkf"));
        timelineList.add(new TimlineListDM("Aya","2hrs","fsfasdff"));
        timelineList.add(new TimlineListDM("Abdo","4hrs","Helsfafsffllo"));
        timelineList.add(new TimlineListDM("Sayed","10hrs","Helsfadsdsdsdfsffllo"));
    }

    private void setupRecyclerView() {
        Log.i(TAG, "setupRecyclerView: ");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new TimelineAdapter(timelineList));
    }
}