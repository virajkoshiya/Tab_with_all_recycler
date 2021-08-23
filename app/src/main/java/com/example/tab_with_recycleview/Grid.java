package com.example.tab_with_recycleview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Grid extends Fragment {

    private RecyclerView recyclergrid;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int[] images={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten,
                R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
        String[] namegrid={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        View view= inflater.inflate(R.layout.fragment_grid, container, false);

        recyclergrid =view.findViewById(R.id.recyclergrid);
        Rec_adapter rec_adapter=new Rec_adapter(namegrid,images);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        recyclergrid.setLayoutManager(gridLayoutManager);
        recyclergrid.setAdapter(new Rec_adapter(namegrid,images));



        return view;
    }
}