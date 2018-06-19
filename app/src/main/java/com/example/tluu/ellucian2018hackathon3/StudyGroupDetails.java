package com.example.tluu.ellucian2018hackathon3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudyGroupDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_group_details);
    }

    public void addClass(View v) {
        Intent intent = new Intent(this, CreateGroup.class);
        startActivityForResult(intent, 1);
    }

    public void vote(View v) {
        /*
        * get text from view
        * parse int and increment
        * set view text
        * */
    }
}
