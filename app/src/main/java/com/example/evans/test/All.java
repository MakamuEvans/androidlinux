package com.example.evans.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.evans.test.model.Movie;
import com.example.evans.test.model.Student;

import java.util.ArrayList;
import java.util.List;

public class All extends AppCompatActivity {
    private List<Student> student = new ArrayList<>();
    private RecyclerView recyclerView;
    private StudentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        student = Student.listAll(Student.class);

        mAdapter = new StudentAdapter(student);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);


    }
}