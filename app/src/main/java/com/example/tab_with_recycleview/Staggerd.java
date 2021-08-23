package com.example.tab_with_recycleview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Staggerd extends Fragment {

    private RecyclerView recyclestagg;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int[] images={R.drawable.one,R.drawable.fifty,R.drawable.three, R.drawable.ele,R.drawable.twel
                ,R.drawable.thir,R.drawable.fort,R.drawable.ten,
                R.drawable.one,R.drawable.eighty,R.drawable.thir,R.drawable.four,R.drawable.fort,
                R.drawable.six,R.drawable.sixty,R.drawable.eight,R.drawable.sevty,R.drawable.ten,
             //   R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
              // R.drawable.six,R.drawable.fifty,R.drawable.sixty,R.drawable.sevty,R.drawable.eighty,
              //  R.drawable.thir,R.drawable.fort,R.drawable.fifty,
              //  R.drawable.sixty,R.drawable.sevty,R.drawable.eighty,R.drawable.nine,R.drawable.ten,
                R.drawable.one};

        View view= inflater.inflate(R.layout.fragment_staggerd, container, false);
        recyclestagg = view.findViewById(R.id.recyclestagg);

        recyclestagg =view.findViewById(R.id.recyclestagg);
        stag_adapter stag_adapter=new stag_adapter(images);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclestagg.setLayoutManager(staggeredGridLayoutManager);
        recyclestagg.setAdapter(new stag_adapter(images));
        return view;

    }
}