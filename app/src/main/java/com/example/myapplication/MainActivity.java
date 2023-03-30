package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //1- Adapterview
    ListView listview;

    //2- Creating the data Source
    String[] worldCup22 = {
            "Germany",
            "Spain",
            "Brazil",
            "England",
            "USA",
            "Saudi Arabia",
            "Qatar"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        //3- Adapter
        ArrayAdapter adapter= new ArrayAdapter(this, R.layout.my_list_item,R.id.textView, worldCup22);

        listview.setAdapter(adapter);
    }
}