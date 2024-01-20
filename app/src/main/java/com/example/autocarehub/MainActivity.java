package com.example.autocarehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button res,forum,about_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = findViewById(R.id.res);
        forum = findViewById(R.id.forum);
        about_app = findViewById(R.id.about_app);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openResources();}
        });
        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openForum();}
        });

    }
    public void openResources() {
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }
    public void openForum() {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}