package com.example.facebooktimline.Kotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.facebooktimline.R

class TimeLineAdapter(var tilmelineList: ArrayList<TimeLineListData>) :
    RecyclerView.Adapter<TimeLineAdapter.TimeLineViewHodler>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeLineViewHodler {
        return TimeLineViewHodler(LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false))
    }

    override fun getItemCount(): Int {
        return tilmelineList.size
    }

    override fun onBindViewHolder(holder: TimeLineViewHodler, position: Int) {
        val timeLineItemData : TimeLineListData = tilmelineList[position]

        holder.textViewProfileName.text = timeLineItemData.name
        holder.textViewTime.text = timeLineItemData.time
        holder.textViewContent.text = timeLineItemData.content

    }

    class TimeLineViewHodler(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewProfileName : TextView = itemView.findViewById(R.id.ProfileName)
        val textViewTime : TextView = itemView.findViewById(R.id.PostTime)
        val textViewContent : TextView = itemView.findViewById(R.id.FBPost)
    }
}