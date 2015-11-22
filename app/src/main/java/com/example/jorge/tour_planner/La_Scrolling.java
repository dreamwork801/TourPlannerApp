package com.example.jorge.tour_planner;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class La_Scrolling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la__scrolling);
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

        ArrayList<String> breakfast = new ArrayList<>();
        LA_Activities tb = new LA_Activities();
        breakfast = tb.getla_breakfast();

        ArrayList<String> lunch = new ArrayList<>();
        LA_Activities tl = new LA_Activities();
        lunch = tl.getla_lunch();


        ArrayList<String> dinner = new ArrayList<>();
        LA_Activities td = new LA_Activities();
        dinner = td.getla_dinner();


        ArrayList<String> bactvity = new ArrayList<>();
        LA_Activities ba = new LA_Activities();
        bactvity = ba.getla_breakfast_activity();

        ArrayList<String> lactivity = new ArrayList<>();
        LA_Activities la = new LA_Activities();
        lactivity = la.getla_lunch_activity();

        ArrayList<String> dactivity = new ArrayList<>();
        LA_Activities da = new LA_Activities();
        dactivity = da.getla_dinner_activity();

        View linearLayout =  findViewById(R.id.la_itinerary);
        //LinearLayout layout = (LinearLayout) findViewById(R.id.info);

        TextView b = new TextView(this);
        b.setText("Breakfast");
        b.setTextSize(40);
        b.setTextColor(Color.BLACK);
        ((LinearLayout) linearLayout).addView(b);


        for(int i =0; i <breakfast.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText(breakfast.get(i));
            valueTV.setTextSize(25);
            valueTV.setTypeface(null, Typeface.BOLD);
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }

        TextView bactivity = new TextView(this);
        bactivity.setText("Breakfast Activity");
        bactivity.setTextSize(40);
        bactivity.setTextColor(Color.BLACK);
        ((LinearLayout) linearLayout).addView(bactivity);


        for(int i =0; i <bactvity.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText(bactvity.get(i));
            valueTV.setTextSize(25);

            valueTV.setTypeface(null, Typeface.BOLD);
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }

        TextView l = new TextView(this);
        l.setText("Lunch");
        l.setTextSize(40);
        l.setTextColor(Color.BLACK);
        ((LinearLayout) linearLayout).addView(l);


        for(int i =0; i <lunch.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText(lunch.get(i));
            valueTV.setTextSize(25);

            valueTV.setTypeface(null, Typeface.BOLD);
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }

        TextView luncha = new TextView(this);
        luncha.setText("Lunch");
        luncha.setTextSize(40);
        luncha.setTextColor(Color.BLACK);
        ((LinearLayout) linearLayout).addView(luncha);


        for(int i =0; i <lactivity.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText(lactivity.get(i));
            valueTV.setTextSize(25);

            valueTV.setTypeface(null, Typeface.BOLD);
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }


        TextView tdinner = new TextView(this);
        tdinner.setText("Dinner");
        tdinner.setTextSize(40);
        tdinner.setTextColor(Color.BLACK);
        ((LinearLayout) linearLayout).addView(tdinner);


        for(int i =0; i <dinner.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText(dinner.get(i));
            valueTV.setTextSize(25);

            valueTV.setTypeface(null, Typeface.BOLD);
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }
        TextView tdinneractivity = new TextView(this);
        tdinneractivity.setText("Dinner Activity ");
        tdinneractivity.setTextColor(Color.BLACK);
        tdinneractivity.setTextSize(40);
        ((LinearLayout) linearLayout).addView(tdinneractivity);


        for(int i =0; i <dactivity.size();i++){

            TextView valueTV = new TextView(this);
            valueTV.setText(dactivity.get(i));
            valueTV.setTextSize(25);

            valueTV.setTypeface(null, Typeface.BOLD);
            valueTV.setId(i);
            ((LinearLayout) linearLayout).addView(valueTV);

        }

    }
}
