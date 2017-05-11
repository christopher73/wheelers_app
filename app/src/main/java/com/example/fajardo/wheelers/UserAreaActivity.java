package com.example.fajardo.wheelers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final Button bStart = (Button) findViewById(R.id.bstart);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);


        // Display user details
        String message = name + " welcome !!!";
        tvWelcomeMsg.setText(message);



        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(UserAreaActivity.this, UserArea1.class);
                UserAreaActivity.this.startActivity(registerIntent);
            }
        });



    }






}
