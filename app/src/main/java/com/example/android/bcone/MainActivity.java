package com.example.android.bcone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent childOne = new Intent(MainActivity.this, activity_child_1.class);
                startActivity(childOne);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent childTwo = new Intent(MainActivity.this, activity_child_2.class);
                startActivity(childTwo);

            }
        });




    }
}
