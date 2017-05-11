package com.example.fajardo.wheelers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserArea1 extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area1);

        final Button button = (Button) findViewById(R.id.b_area1);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(UserArea1.this, UserArea2.class);
                UserArea1.this.startActivity(registerIntent);
            }
        });



    }






}
