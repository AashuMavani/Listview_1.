package com.example.listview_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    ArrayList<String>Arrlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=findViewById(R.id.listview);

        Arrlist.add("One");
        Arrlist.add("Two");
        Arrlist.add("Three");
        Arrlist.add("Four");
        Arrlist.add("Five");
        Arrlist.add("Six");
        Arrlist.add("Seven");
        Arrlist.add("Eight");
        Arrlist.add("Nine");
        Arrlist.add("Ten");
        Arrlist.add("Eleven");
        Arrlist.add("Twelve");
        Arrlist.add("Thirteen");
        Arrlist.add("Fourteen");
        Arrlist.add("Fifteen");
        Arrlist.add("Sixteen");
        Arrlist.add("Seventeen");
        Arrlist.add("Eighteen");
        Arrlist.add("Nineteen");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_list_item_1,Arrlist);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(MainActivity2.this, "on clickListener", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}