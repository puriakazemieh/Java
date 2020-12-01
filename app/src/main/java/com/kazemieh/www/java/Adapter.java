package com.kazemieh.www.java;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    List<DataModel> dataModels;

    Adapter (Context context,List<DataModel>dataModels){
        this.context=context;
        this.dataModels=dataModels;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(dataModels.get(position).getTitle());
        holder.imageView.setImageResource(dataModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv_AdapterMain_image);
            textView=itemView.findViewById(R.id.tv_AdapterMain_title);

            textView.setTypeface(Main.font);
            textView.setTextSize(Main.size);
            textView.setLineSpacing(Main.space,1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,Matn.class);
                    intent.putExtra("matn",textView.getText().toString());
                    context.startActivity(intent);
                }
            });
        }
    }
}
