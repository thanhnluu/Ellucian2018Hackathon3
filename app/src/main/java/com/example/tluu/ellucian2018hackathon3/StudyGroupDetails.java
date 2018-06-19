package com.example.tluu.ellucian2018hackathon3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StudyGroupDetails extends AppCompatActivity {

    TextView classname;
    TextView numMembers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_group_details);
        classname = (TextView)findViewById(R.id.classname);
        numMembers = (TextView)findViewById(R.id.numMembers);
        Bundle bundle = getIntent().getExtras();
        classname.setText(bundle.getString("CLASSNAME"));
        numMembers.setText(bundle.getString("NUMMEMBERS"));
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
