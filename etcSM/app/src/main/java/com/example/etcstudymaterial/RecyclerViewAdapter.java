package com.example.etcstudymaterial;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Books> lstBooks;

    RecyclerViewAdapter(Context mContext, List<Books> lstBooks) {
        this.mContext = mContext;
        this.lstBooks = lstBooks;
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_books,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(lstBooks.get(position).getSubname());
        holder.tv_sub.setText(lstBooks.get(position).getSub());
        holder.img.setImageResource(lstBooks.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {
        return lstBooks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tv_name;
        private TextView tv_sub;
        private ImageView img ;

        private MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            tv_name = itemView.findViewById(R.id.name_subject);
            tv_sub = itemView.findViewById(R.id.subject);
            img =  itemView.findViewById(R.id.img_book);
            img.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            int position = this.getAdapterPosition();
            Books books = lstBooks.get(position);
            String sub = books.getSub();
            Intent intent = new Intent(mContext,Math.class);
            intent.putExtra("Rsub",sub);
            mContext.startActivity(intent);

        }
    }
}
