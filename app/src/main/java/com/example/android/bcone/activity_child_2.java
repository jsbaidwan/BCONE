package com.example.android.bcone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_child_2 extends AppCompatActivity {
    Button popUp1;
    Button popUp2;
    Button popUp3;
    Button popUp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.child_layout_2);
        popUp1 = (Button) findViewById(R.id.audit_now_1);
        popUp2 = (Button) findViewById(R.id.audit_now_2);
        popUp3 = (Button) findViewById(R.id.audit_now_3);
        popUp4 = (Button) findViewById(R.id.audit_now_4);

        popUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popUp = new Intent(activity_child_2.this, Popup.class);
                startActivity(popUp);

            }
        });

        popUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popUp = new Intent(activity_child_2.this, Popup.class);
                startActivity(popUp);

            }
        });

        popUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popUp = new Intent(activity_child_2.this, Popup.class);
                startActivity(popUp);

            }
        });

        popUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popUp = new Intent(activity_child_2.this, Popup.class);
                startActivity(popUp);

            }
        });

    }
}
