package com.example.facebooktimline;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktimline.Adapter.TimelineAdapter;
import com.example.facebooktimline.Adapter.TimlineListDM;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<TimlineListDM> timelineList;

    private RecyclerView recyclerView;

    private TimelineAdapter timelineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreatesTimelineList();
        setupRecyclerView();
    }

    private void CreatesTimelineList() {
        ArrayList<TimlineListDM> timelineList = new ArrayList<>();

        timelineList.add(new TimlineListDM("ALi Hassan", "21:00", "Hello World"));
        timelineList.add(new TimlineListDM("Ali Sayed", "00:00", "Nice World"));
        timelineList.add(new TimlineListDM("Ali Emad", "15:00", "Hello Friend"));
        timelineList.add(new TimlineListDM("Ali Kamal", "20:00", "----------"));
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(timelineAdapter);
    }
}