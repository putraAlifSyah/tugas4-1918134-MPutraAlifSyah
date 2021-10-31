package com.example.recycle_1918134;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List adapter;
    private ArrayList<Repo> ctnArrayList;
    private ArrayList<Repo> ctArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycleview);
        adapter = new List(ctnArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        ctnArrayList = new ArrayList<>();
        ctnArrayList.add(new Repo("Kosakana", "Idol",
                "Expectation is the root of all heartache",R.drawable.kosaka));
        ctnArrayList.add(new Repo("Haruna Kawaguchi", "Actris",
                "Never let the things that you want make you forget the things that you have.",R.drawable.haruna));
        ctnArrayList.add(new Repo("Ohama", "Singer",
                "Don’t stop when you are tired. Stop when you are done!",R.drawable.ohama));
        ctnArrayList.add(new Repo("Oshusi", "Idol",
                "Only you can change your life. Nobody else can do it for you",R.drawable.miku));
    }


}

