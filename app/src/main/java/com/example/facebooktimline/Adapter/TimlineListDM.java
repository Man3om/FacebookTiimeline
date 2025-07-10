package com.example.facebooktimline.Adapter;

public class TimlineListDM {
    private String profileName;
    private String time;
    private String content;
    private int imageView_profile;
    private int imageView_Content;

    public TimlineListDM(String profileName, String time, String content, int imageView_profile, int imageView_Content) {
        this.profileName = profileName;
        this.time = time;
        this.content = content;
        this.imageView_profile = imageView_profile;
        this.imageView_Content = imageView_Content;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageView_profile() {
        return imageView_profile;
    }

    public void setImageView_profile(int imageView_profile) {
        this.imageView_profile = imageView_profile;
    }

    public int getImageView_Content() {
        return imageView_Content;
    }

    public void setImageView_Content(int imageView_Content) {
        this.imageView_Content = imageView_Content;
    }
}
