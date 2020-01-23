package com.example.retrofitwebservice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    private List<User> list;

    public RecyclerAdapter(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.user_data,parent,false);
        RecyclerAdapter.ViewHolder rv=new RecyclerAdapter.ViewHolder(view);
        return rv;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
    User model=list.get(position);
    holder.id.setText(""+model.getId());
    holder.body.setText(""+model.getBody());
    holder.title.setText(""+model.getTitle());
    holder.userid.setText(""+model.getUserId());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        TextView id,userid,title,body;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id= itemView.findViewById(R.id.id);
            userid= itemView.findViewById(R.id.userid);
            title= itemView.findViewById(R.id.title);
            body= itemView.findViewById(R.id.body);

        }
    }
}
