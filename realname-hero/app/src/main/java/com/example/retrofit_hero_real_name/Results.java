package com.example.retrofit_hero_real_name;

import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("name")
    private String name;
    @SerializedName("realname")
    private String realname;
    public Results(String name, String realname) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }
}
