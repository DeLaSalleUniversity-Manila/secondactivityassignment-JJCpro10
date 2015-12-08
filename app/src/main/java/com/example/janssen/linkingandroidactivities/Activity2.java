package com.example.janssen.linkingandroidactivities;

/**
 * Created by Janssen on 12/8/2015.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        handleIntent();
    }



    private void handleIntent(){
        Intent i = getIntent();
        String day_out = i.getStringExtra("message");
        TextView tOut = (TextView) findViewById(R.id.textView);
        tOut.setText(day_out);
    }



}