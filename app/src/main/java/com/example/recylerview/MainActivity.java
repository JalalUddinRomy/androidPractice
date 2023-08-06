package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import customAdapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] Country_names;
    int[] Flags={R.drawable.jalal,R.drawable.sylhet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_item);
        Country_names=getResources().getStringArray(R.array.country_names);
        CustomAdapter adapter=new CustomAdapter(this,Country_names,Flags);
        listView.setAdapter(adapter);

    }
}