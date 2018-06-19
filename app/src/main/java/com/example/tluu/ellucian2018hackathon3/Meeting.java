package com.example.tluu.ellucian2018hackathon3;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Meeting {
    private ArrayList<Student> members;
    private String name;
    private Date date;
    private Time startTime;
    private Time endTime;
    private int maxSeats;

    public Meeting(ArrayList<Student> s, String n, Date d, Time st, Time et, int m){
        members = s;
        name = n;
        date = d;
        startTime = st;
        endTime = et;
        maxSeats = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartTime(Time time) {
        this.startTime = time;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Student> members) {
        this.members = members;
    }
}
