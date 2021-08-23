package com.example.tab_with_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

public class Rec_adapter_hori extends RecyclerView.Adapter<Rec_adapter_hori.viewholder> {

    String[] datahori;
    //
    int[] images;

//    public Rec_adapter_hori(String[] datahori) {
//        this.datahori = datahori;
//    }


    public Rec_adapter_hori(String[] datahori, int[] images) {
        this.datahori = datahori;
        this.images = images;
    }

    @NonNull
    @NotNull
    @Override
    public viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater inflater_hori=LayoutInflater.from(parent.getContext());
        View viewhori= inflater_hori.inflate(R.layout.single_item_horizontal,parent,false);
        return new viewholder(viewhori) ;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewholder holder, int position) {

        String user_name_hori=datahori[position];
        //
        int img=images[position];
        holder.texthori.setText(user_name_hori);
//
        Glide.with(holder.imghori.getContext()).load(img).into(holder.imghori);

    }

    @Override
    public int getItemCount() {
        return datahori.length;
    }

    public class viewholder extends RecyclerView.ViewHolder{

        private ImageView imghori;
        private TextView texthori;


        public viewholder(@NonNull @NotNull View itemView_hori) {

            super(itemView_hori);

            imghori = (ImageView) itemView.findViewById(R.id.imgh);
            texthori = (TextView) itemView.findViewById(R.id.texth);


        }
    }
}
