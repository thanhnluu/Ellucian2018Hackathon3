package com.example.tluu.ellucian2018hackathon3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView helloTextView = findViewById(R.id.textbox);
        Date currentTime = Calendar.getInstance().getTime();
        helloTextView.setText(currentTime.toString());

        ArrayList<Date> dates;
        dates.add()
        Schedule testSchedule()
        Student testStudent()


    }
}
