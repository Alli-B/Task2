package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);

        list.add("Likes");
        list.add("Gaming ");
        list.add("Eating Food");
        list.add("Dislikes");
        list.add("Bad Vibes");
        list.add("Hobiies");
        list.add("Football");
        list.add("Programming");
        list.add("Hobiies");
        list.add("Hobiies");
        list.add("Hobiies");

        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

    }
}
