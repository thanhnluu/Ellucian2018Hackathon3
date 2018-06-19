package com.example.tluu.ellucian2018hackathon3;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Schedule {
    ArrayList<Class> classes;


    public Schedule(ArrayList<Class> c){
        classes = c;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }
}
