package com.example.facebooktimline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktimline.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.TimelineViewHolder> {

    private ArrayList<TimlineListDM> timelineList ;

    public TimelineAdapter(ArrayList<TimlineListDM> timelineList) {
        this.timelineList = timelineList;
    }


    @NonNull
    @Override
    public TimelineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return new TimelineViewHolder(LayoutInflater.from(parent.getContext())
              .inflate(R.layout.timeline_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TimelineViewHolder holder, int position) {
            TimlineListDM timlineListDM = timelineList.get(position);
            holder.textView_profileName.setText(timlineListDM.getProfileName());
            holder.textView_time.setText(timlineListDM.getTime());
            holder.textView_content.setText(timlineListDM.getContent());
    }

    @Override
    public int getItemCount() {
        return timelineList.size();
    }

    class TimelineViewHolder extends RecyclerView.ViewHolder {

        TextView textView_profileName;
        TextView textView_time;

        TextView textView_content;
        public TimelineViewHolder(@NonNull View itemView) {
            super(itemView);
            //find view by id

        }
    }
}
