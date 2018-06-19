package com.example.tluu.ellucian2018hackathon3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
* contains the logic used to create new groups
*
* */
public class CreateGroup extends AppCompatActivity {

    private Button create;

    private EditText groupN;
    private String groupName;

    private EditText classN;
    private String classTitle;

    private EditText size;
    private int groupSize;

    private EditText descrip;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);

        create = (Button) findViewById(R.id.createGroupBtn);
        groupN = (EditText) findViewById(R.id.groupName);
        classN = (EditText) findViewById(R.id.classTitle);
        size = (EditText) findViewById(R.id.groupSize);
        descrip = (EditText) findViewById(R.id.description);

        create.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //grabs info from text boxes
                pullGroupName();
                pullClassTitle();
                pullGroupSize();
                pullDescription();

                //update main group list code here**

                //opens up the main activity view
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public String pullGroupName(){
        groupName = groupN.getText().toString();
        return groupName;
    }

    public String pullClassTitle(){
        classTitle = classN.getText().toString();
        return classTitle;
    }

    public int pullGroupSize(){
        groupSize = Integer.parseInt(size.getText().toString());
        return groupSize;
    }

    public String pullDescription(){
        description = descrip.getText().toString();
        return description;
    }
}
