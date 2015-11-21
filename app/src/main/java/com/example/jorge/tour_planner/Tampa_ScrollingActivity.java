package com.example.jorge.tour_planner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Tampa_ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampa__scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayList<String> itinerary = new ArrayList<>();
        tampa_tab3 t3 = new tampa_tab3();
        itinerary = t3.getTampa_dinner();

        View linearLayout =  findViewById(R.id.info);
        //LinearLayout layout = (LinearLayout) findViewById(R.id.info);

        for(int i =0; i <itinerary.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText("hallo hallo");
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }

        //valueTV.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));




    }
}
