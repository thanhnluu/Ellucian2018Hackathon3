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

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter myAdapter;
    ArrayList<String> className;
    ArrayList<String> classTimes;
    ArrayList<String> numMembers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.mylist);
        className = new ArrayList<String>();
        classTimes = new ArrayList<String>();
        numMembers = new ArrayList<String>();
        myAdapter = new CustomAdapter(this, className, classTimes, numMembers);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Bundle bundle = new Bundle();
                    bundle.putString("CLASSNAME", className.get(position));
                    bundle.putString("CLASSTIME", classTimes.get(position));
                    bundle.putString("NUMMEMBERS", numMembers.get(position));
                    Intent intent = new Intent(MainActivity.this, StudyGroupDetails.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                String oldNumMembers = numMembers.get(i);
                numMembers.set(i, Integer.toString(Integer.parseInt(oldNumMembers) + 1));
                myAdapter.notifyDataSetChanged();
                String message = "Joined group " + className.get(i);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void addGroup(View v) {
        Intent intent = new Intent(this, CreateGroup.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Toast.makeText(this, "Group successfully created", Toast.LENGTH_SHORT).show();
            className.add(data.getExtras().getString("CLASSNAME"));
            classTimes.add(data.getExtras().getString("CLASSTIME"));
            numMembers.add(data.getExtras().getString("NUMMEMBER"));
            myAdapter.notifyDataSetChanged();
        }
    }

    public class CustomAdapter extends BaseAdapter {
        Context context;
        List<String> classname;
        List<String> classTimes;
        List<String> numMembers;

        public CustomAdapter(Context context, List<String> className, List<String> classTimes, List<String> numMembers) {
            // TODO Auto-generated constructor stub
            this.context = context;
            this.classname = className;
            this.classTimes = classTimes;
            this.numMembers = numMembers;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return classname.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return  classname.get(position);
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

            TextView name = (TextView) convertView.findViewById(R.id.classname);
            TextView time = (TextView) convertView.findViewById(R.id.classTime);
            TextView members = (TextView) convertView.findViewById(R.id.numMembers);
            name.setText(classname.get(position));
            time.setText(classTimes.get(position));
            members.setText(numMembers.get(position));
            return convertView;
        }

    }
}
