package com.example.tab_with_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Recycle_sample extends AppCompatActivity {

    private RecyclerView recycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_sample);
        int[] images={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
        String[] name={"one","two","three","four","five","six","seven","eight","nine","ten","eleven"};
        recycler = (RecyclerView) findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new Rec_adapter(name,images));

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recycler.setLayoutManager(linearLayoutManager);

    }
}