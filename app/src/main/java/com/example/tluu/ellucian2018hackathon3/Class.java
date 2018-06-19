package com.example.tluu.ellucian2018hackathon3;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Class {
    Time startTime;
    Time endTime;
    Date date;
    String name;


    Class(Time st, Time et, Date d, String n){
        startTime = st;
        endTime = et;
        date = d;
        name = n;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }
    
}
