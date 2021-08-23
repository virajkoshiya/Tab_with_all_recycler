package com.example.tab_with_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

public class stag_adapter  extends RecyclerView.Adapter<stag_adapter.viewholder> {


    int[] imgstag;


    public stag_adapter( int[] images) {

        this.imgstag = images;
    }

    @NonNull
    @NotNull
    @Override
    public viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View viewstag= inflater.inflate(R.layout.stagg_item,parent,false);
        return new viewholder(viewstag) ;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewholder holder, int position) {
        int img=imgstag[position];
        Glide.with(holder.img.getContext()).load(img).into(holder.img);
    }



    @Override
    public int getItemCount() {
        return imgstag.length;
    }

    public class viewholder extends RecyclerView.ViewHolder{

        private ImageView img;



        public viewholder(@NonNull @NotNull View itemView) {

            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.stimg);



        }
    }
}

