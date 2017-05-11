package com.example.fajardo.wheelers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserArea3 extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confir);

        final Button button = (Button) findViewById(R.id.b_confir);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(UserArea3.this, UserArea4.class);
                UserArea3.this.startActivity(registerIntent);
            }
        });



    }






}
