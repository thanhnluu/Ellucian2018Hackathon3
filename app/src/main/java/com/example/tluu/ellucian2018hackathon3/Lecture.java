package com.example.tluu.ellucian2018hackathon3;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Lecture {
    String dayOfWeek;
    int startTime;
    int endTime;
    String name;


    Lecture(int st, String d, String n){
        startTime = st;
        dayOfWeek = d;
        name = n;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}