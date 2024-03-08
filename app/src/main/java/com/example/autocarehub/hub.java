package com.example.autocarehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class hub extends AppCompatActivity {

    FirebaseAuth auth;
    Button button;
    FirebaseUser user;


    Button res, forum, about_app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.logout);
        user = auth.getCurrentUser();
        if (user == null){
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });


        res = findViewById(R.id.res);
        forum = findViewById(R.id.forum);
        about_app = findViewById(R.id.about_app);
//
        about_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutApp();
            }
        });

        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForum();
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResources();
            }
        });

    }

    public void openAboutApp() {
        Intent intent = new Intent(this, Forum.class);
        startActivity(intent);
    }

    public void openForum() {
        Intent intent = new Intent(this, Forum.class);
        startActivity(intent);
    }


    public void openResources() {
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }
}