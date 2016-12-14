package com.example.martin.projekt1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Martin on 2016.12.12..
 */

public class DisplayScreen extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);


        SharedPreferences preferences = getSharedPreferences("MAYPRESS", MODE_PRIVATE);
        String display =preferences.getString("display", "");
        TextView displayInfo =(TextView) findViewById(R.id.textViewName);
        displayInfo.setText(display);


    }
}
