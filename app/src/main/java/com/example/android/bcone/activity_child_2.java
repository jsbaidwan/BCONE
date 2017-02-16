package com.example.android.bcone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_child_2 extends AppCompatActivity {
    Button popUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.child_layout_2);
        popUp = (Button) findViewById(R.id.audit_now);

        popUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popUp = new Intent(activity_child_2.this, Popup.class);
                startActivity(popUp);

            }
        });

    }
}
