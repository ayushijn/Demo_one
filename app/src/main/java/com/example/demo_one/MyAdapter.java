package com.example.demo_one;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ct;
    String[] s1,s2;
    int[] images;
    public  MyAdapter(Context ct,String[] s1, String[] s2,int[] images)
    {this.ct=ct;
    this.s1=s1;
    this.s2=s2;
    this.images=images;
    }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(ct);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
holder.text1.setText(s1[position]);
holder.text2.setText(s2[position]);
holder.Myimg.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView Myimg;
        TextView text1,text2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Myimg=itemView.findViewById(R.id.img);
            text1=itemView.findViewById(R.id.lang_name);
            text2=itemView.findViewById(R.id.description);
        }
    }
}
