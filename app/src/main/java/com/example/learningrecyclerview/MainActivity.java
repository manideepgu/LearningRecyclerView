package com.example.learningrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Model> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();




        /*recyclerView=findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Contact con = new Contact();
        con.setName("Manideep");
        con.setNumber(9003);
        Contact son = new Contact();
        con.setName("Diptreyo");
        con.setNumber(4243);



        contactArrayList = new ArrayList<>();

        contactArrayList.add(con);
        contactArrayList.add(son);

        recyclerVIewAdapter = new RecyclerVIewAdapter(MainActivity.this,contactArrayList);
        recyclerView.setAdapter(recyclerVIewAdapter);*/







    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.rec);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new Model("Manideep","900076744"));
        userList.add(new Model("Diptreyo","123243244"));
        userList.add(new Model("Manideep","900076744"));
        userList.add(new Model("Diptreyo","123243244"));
        userList.add(new Model("Diptreyo","1232432"));        userList.add(new Model("Manideep","900076744"));
        userList.add(new Model("Diptreyo","123243244"));
        userList.add(new Model("Manideep","900076744"));
        userList.add(new Model("Diptreyo","123243244"));
        userList.add(new Model("Diptreyo","1232432"));


    }
}