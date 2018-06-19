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
    }
}
