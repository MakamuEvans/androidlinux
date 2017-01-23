package com.example.evans.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.evans.test.model.Student;

public class MainActivity extends AppCompatActivity {

    //EditText firstname, lastname, regnumber, emailaddress;
    Button savestudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button savebutton = (Button) findViewById(R.id.savestudent);
        final EditText firstname = (EditText) findViewById(R.id.firstname);
        final EditText lastname = (EditText) findViewById(R.id.lastname);
        final EditText regnumber = (EditText) findViewById(R.id.regnumber);
        final EditText emailaddress = (EditText) findViewById(R.id.emailaddress);

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student newstudent = new Student(firstname.getText().toString(),
                        lastname.getText().toString(), regnumber.getText().toString(), emailaddress.getText().toString());
                newstudent.save();

                Toast.makeText(getBaseContext(), newstudent.getFirstname()+" Added Successfully", Toast.LENGTH_LONG).show();

                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

        Toast.makeText(getBaseContext(), "Welcome To the System", Toast.LENGTH_LONG).show();
    }
     public void viewall(View view){

        Intent intent= new Intent(MainActivity.this, All.class);
         startActivity(intent);

     }
}
