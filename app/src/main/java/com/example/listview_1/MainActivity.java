package com.example.listview_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String demo[]={"January","February","March","April","May","Jun","July","August","Sptember","Octomber",
    "November","December","Monday","Tuesday","Wendsday","Thursday","friday","saterday","sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new  ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,demo);
        listView.setAdapter(adapter);
    }
}