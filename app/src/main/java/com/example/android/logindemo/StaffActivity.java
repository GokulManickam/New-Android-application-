package com.example.android.logindemo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class StaffActivity extends AppCompatActivity {

    private EditText n;
    private EditText p;
    private Button btn;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;
    FirebaseUser firebaseUser = firebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        n = (EditText) findViewById(R.id.sName);
        p = (EditText) findViewById(R.id.sPassword);
        btn = (Button) findViewById(R.id.btnLoginstaff);

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);
        FirebaseUser user = firebaseAuth.getCurrentUser();

        firebaseDatabase = FirebaseDatabase.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getInstance().getCurrentUser();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((n.getText().toString().equals("admin")) && (p.getText().toString().equals("password"))) {
                    startActivity(new Intent(StaffActivity.this, StaffStudentActivity.class));
                } else {
                    Toast.makeText(StaffActivity.this, "Authorization Denied", Toast.LENGTH_LONG).show();
                }

            }

        });

    }

    }














