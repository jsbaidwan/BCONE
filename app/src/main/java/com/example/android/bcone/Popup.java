package com.example.android.bcone;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by jsbaidwan on 15/02/17.
 */
public class Popup extends Activity {

    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_window);

        spinner1 = (Spinner) findViewById(R.id.spinner_1);
        spinner2 = (Spinner) findViewById(R.id.spinner_2);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        // Size of popUp window
        getWindow().setLayout((int) (width * .8), (int) (height * .7));

        String[] items1 = new String[]
                {"Not Started",
                 "In Progress",
                 "Complete"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, items1);
        spinner1.setAdapter(adapter);

        String[] items2 = new String[]
                {"0%",
                 "10%",
                 "20%",
                 "30%",
                 "40%",
                 "50%",
                 "60%",
                 "70%",
                 "80%",
                 "90%",
                 "100%",
                };

        ArrayAdapter<String> nadapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, items2);
        spinner2.setAdapter(nadapter);

    }


}
