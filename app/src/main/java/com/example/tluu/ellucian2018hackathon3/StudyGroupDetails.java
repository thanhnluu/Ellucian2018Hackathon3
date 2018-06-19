package com.example.tluu.ellucian2018hackathon3;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupDetails extends AppCompatActivity {

    TextView classname;
    TextView numMembers;
    TextView messages;
    ListView listView;
    CustomAdapter myAdapter;
    ArrayList<String> dates;
    ArrayList<String> times;
    ArrayList<String> votes;
    Dialog newPost, addTimeBox;
    EditText postText, date, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_group_details);
        dates = new ArrayList<String>();
        times = new ArrayList<String>();
        messages = (TextView)findViewById(R.id.Messages);
        votes = new ArrayList<String>();
        newPost = new Dialog(this);
        newPost.requestWindowFeature(Window.FEATURE_NO_TITLE);
        newPost.setContentView(R.layout.newpost);
        newPost.setCancelable(false);
        addTimeBox = new Dialog(this);
        addTimeBox.requestWindowFeature(Window.FEATURE_NO_TITLE);
        addTimeBox.setContentView(R.layout.add_schedule_form);
        addTimeBox.setCancelable(false);
        messages = (TextView) findViewById(R.id.Messages);
        postText = (EditText) newPost.findViewById(R.id.postText);
        date = (EditText) addTimeBox.findViewById(R.id.date);
        time = (EditText) addTimeBox.findViewById(R.id.time);
        listView = (ListView) findViewById(R.id.mylist);
        classname = (TextView)findViewById(R.id.classname);
        numMembers = (TextView)findViewById(R.id.numMembers);
        Bundle bundle = getIntent().getExtras();
        classname.setText(bundle.getString("CLASSNAME"));
        numMembers.setText("Members: " + bundle.getString("NUMMEMBERS"));
        myAdapter = new CustomAdapter(this, dates, times, votes);
        listView.setAdapter(myAdapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                String oldVotes = votes.get(i);
                votes.set(i, Integer.toString(Integer.parseInt(oldVotes) + 1));
                myAdapter.notifyDataSetChanged();
                String message = "Vote recorded";
                Toast.makeText(StudyGroupDetails.this, message, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void addClass(View v) {
       addTimeBox.show();
    }

    public void addTime(View v){
        addTimeBox.dismiss();
        dates.add(date.getText().toString().trim());
        times.add(time.getText().toString().trim());
        votes.add("0");
        date.setText("");
        time.setText("");
        myAdapter.notifyDataSetChanged();
    }

    public void post(View v) {
            newPost.dismiss();
            String content = postText.getText().toString().trim();
            String oldMessages = messages.getText().toString();
            messages.setText(oldMessages + "\n\n" + content);
            postText.setText("");
    }
    
    public void vote(View v){
        newPost.show();
    }

    public class CustomAdapter extends BaseAdapter {
        Context context;
        List<String> dates;
        List<String> times;
        List<String> votes;

        public CustomAdapter(Context context, List<String> dates, List<String> times, List<String> votes) {
            // TODO Auto-generated constructor stub
            this.context = context;
            this.dates = dates;
            this.times = times;
            this.votes = votes;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return dates.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return  dates.get(position);
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub

            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.line, null);
            }

            TextView date = (TextView) convertView.findViewById(R.id.classname);
            TextView time = (TextView) convertView.findViewById(R.id.classTime);
            TextView vote = (TextView) convertView.findViewById(R.id.numMembers);
            date.setText(dates.get(position));
            time.setText(times.get(position));
            vote.setText(votes.get(position));
            return convertView;
        }

    }
}
