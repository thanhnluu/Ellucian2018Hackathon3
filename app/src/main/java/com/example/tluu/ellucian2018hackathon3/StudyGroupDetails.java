package com.example.tluu.ellucian2018hackathon3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupDetails extends AppCompatActivity {

    TextView classname;
    TextView numMembers;
    ListView listView;
    CustomAdapter myAdapter;
    ArrayList<String> dates;
    ArrayList<String> times;
    ArrayList<String> votes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_group_details);
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
        Intent intent = new Intent(this, AddClassSchedule.class);
        startActivityForResult(intent, 1);
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
