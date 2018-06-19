package com.example.tluu.ellucian2018hackathon3;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Schedule {
    ArrayList<Class> classes;

    public Schedule(){
        classes = new ArrayList<>();
    }

    public Schedule(ArrayList<Class> c){
        classes = c;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public void addClass(Class c){
        classes.add(c);
    }

    public Class getIndividualClass(int i){
        return classes.get(i);
    }
}
