package com.example.facebooktimline.Adapter;

import android.widget.ImageView;

public class TimlineListDM {
    private String profileName;
    private String time;
    private String content;

    public TimlineListDM(String profileName, String time, String content) {
        this.profileName = profileName;
        this.time = time;
        this.content = content;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
