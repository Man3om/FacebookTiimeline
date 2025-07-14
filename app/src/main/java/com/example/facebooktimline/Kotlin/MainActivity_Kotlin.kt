package com.example.facebooktimline.Kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.facebooktimline.Kotlin.Adapter.TimeLineAdapter
import com.example.facebooktimline.Kotlin.Adapter.TimeLineListData
import com.example.facebooktimline.R

class MainActivity_Kotlin : AppCompatActivity() {
    private val TAG = "MainActivity"

    private lateinit var recyclerView: RecyclerView

    private var timeLineList = ArrayList<TimeLineListData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createTimeLineList()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = TimeLineAdapter(timeLineList)
    }

    private fun createTimeLineList() {
        Log.i(TAG, "CreatesTimelineList: ")
        timeLineList = ArrayList()

        timeLineList.add(TimeLineListData("Ahmed", "3hrs", "Helllo"))
        timeLineList.add(TimeLineListData("Ali", "18hrs", "Wordlkfkf"))
        timeLineList.add(TimeLineListData("Aya", "2hrs", "fsfasdff"))
        timeLineList.add(TimeLineListData("Abdo", "4hrs", "Helsfafsffllo"))
        timeLineList.add(TimeLineListData("Sayed", "10hrs", "Helsfadsdsdsdfsffllo"))

    }
}