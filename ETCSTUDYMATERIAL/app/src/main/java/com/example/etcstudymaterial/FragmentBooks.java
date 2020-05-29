package com.example.etcstudymaterial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;

public class FragmentBooks extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Books> lstBooks;


    public FragmentBooks() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.books_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.books_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstBooks);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstBooks = new ArrayList<>();
        lstBooks.add(new Books("Subject name:","Bcem",R.drawable.civil));
        lstBooks.add(new Books("Subject name:","Math",R.drawable.math));
        lstBooks.add(new Books("Subject name:","Chemistry",R.drawable.chemistry));
        lstBooks.add(new Books("Subject name:","PPS",R.drawable.pps));
        lstBooks.add(new Books("Subject name:","English",R.drawable.en));
    }
}

