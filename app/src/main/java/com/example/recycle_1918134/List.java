package com.example.recycle_1918134;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List extends
        RecyclerView.Adapter<List.ContentViewHolder> {
    private ArrayList<Repo> dataList;

    public List(ArrayList<Repo> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public List.ContentViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ContentViewHolder(view);
    }

    public void onBindViewHolder(ContentViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtJob.setText(dataList.get(position).getJob());
        holder.txtQuote.setText(dataList.get(position).getQuote());
        holder.images_profile.setImageResource(dataList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ContentViewHolder extends
            RecyclerView.ViewHolder {
        private TextView txtNama, txtJob, txtQuote;
        private ImageView images_profile;

        public ContentViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtJob = (TextView)
                    itemView.findViewById(R.id.txt_job);
            txtQuote = (TextView)
                    itemView.findViewById(R.id.txt_quote);
            images_profile=(ImageView)
                    itemView.findViewById(R.id.image);
        }
    }
}
