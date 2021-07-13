package com.example.learningrecyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Model> userList;

    public Adapter(List<Model> userList) {
        this.userList = userList;
    }

    @NonNull

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        Log.d("TAG","Inside OncreateViewHolder ##########################");

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
    String name = userList.get(position).getText1();
    String number = userList.get(position).getText2();
    Log.d("TAG","Inside OnBindViewHolder %%%%%%%%%%%%%%%%%%%%");
    holder.setData(name,number);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView1;
        TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.name);
            textView2=itemView.findViewById(R.id.phone);

        }

        public void setData(String name, String number) {

            textView1.setText(name);
            textView2.setText(number);
        }
    }
}
