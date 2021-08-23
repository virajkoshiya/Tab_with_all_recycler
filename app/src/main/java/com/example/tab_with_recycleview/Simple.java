package com.example.tab_with_recycleview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Simple extends Fragment {

   public View v,h;

    private RecyclerView recycler,recyclerhori;

    public Simple() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view1 = inflater.inflate(R.layout.fragment_simple, container, false);

        // FOR VERTICAL
        int[] imagess={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
        String[] name={"one","two","three","four","five","six","seven","eight","nine","ten"};
      // View view= inflater.inflate(R.layout.fragment_simple, container, false);
        recycler =(RecyclerView) view1.findViewById(R.id.recycler);
        //
      //  recycler.setHasFixedSize(true);
       // Rec_adapter rec_adapter=new Rec_adapter(name,imagess);
        Rec_adapter_hori adapter1 = new Rec_adapter_hori(name, imagess);
        LinearLayoutManager mlinearLayoutManagerv= new LinearLayoutManager(getContext());
       // LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        recycler.setLayoutManager(mlinearLayoutManagerv);
        recycler.setAdapter(adapter1);

        //FOR HORIZONTAL

        String[] namehori={"one","two","three","four","five","six","seven","eight","nine","ten"};
        int[] images={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
    //  View viewh= inflater.inflate(R.layout.fragment_simple, container, false);
        recyclerhori =(RecyclerView) view1.findViewById(R.id.recyclerhori);
        //
       // recycler.setHasFixedSize(true);
        Rec_adapter_hori rec_adapterhori =new Rec_adapter_hori(namehori,images);
        LinearLayoutManager linearLayoutManagerhori= new LinearLayoutManager(getContext(),recyclerhori.HORIZONTAL,false);
        recyclerhori.setLayoutManager(linearLayoutManagerhori);
        recyclerhori.setAdapter(rec_adapterhori);

      //  return inflater.inflate(R.layout.fragment_simple, container, false);

        return view1;

    }

}

