package com.example.jorge.tour_planner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;


public class activity_list extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */


    public static ArrayList<String> getorlando_dinner() {
        return orlando_dinner;
    }



    public static ArrayList<String> getorlando_dinner_activity() {
        return orlando_dinner_activity;
    }


    public static ArrayList<String> getorlando_lunch() {
        return orlando_lunch;
    }

    public static ArrayList<String> getorlando_breakfast_activity() {
        return orlando_breakfast_activity;
    }

    public static ArrayList<String> getorlando_lunch_activity() {
        return orlando_lunch_activity;
    }

    public static ArrayList<String> getorlando_breakfast() {
        return orlando_breakfast;
    }

    private static ArrayList<String>  orlando_breakfast= new ArrayList<String>();
    private static ArrayList<String>  orlando_lunch= new ArrayList<String>();
    private static ArrayList<String>  orlando_dinner= new ArrayList<String>();

    private static ArrayList<String>  orlando_breakfast_activity = new ArrayList<String>();
    private static ArrayList<String>  orlando_lunch_activity = new ArrayList<String>();
    private static ArrayList<String>  orlando_dinner_activity = new ArrayList<String>();


    public static void orlando_breakfast_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            orlando_breakfast_activity.add(c.getText().toString());
        }
        else
            orlando_breakfast_activity.remove(c.getText().toString());
    }


    public static void orlando_lunch_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            orlando_lunch_activity.add(c.getText().toString());
        }
        else
            orlando_lunch_activity.remove(c.getText().toString());
    }

    public static void orlando_dinner_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            orlando_dinner_activity.add(c.getText().toString());
        }
        else
            orlando_dinner_activity.remove(c.getText().toString());
    }



    public static void orlando_breakfast(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            orlando_breakfast.add(c.getText().toString());
        }
        else
            orlando_breakfast.remove(c.getText().toString());

    } public static void orlando_lunch(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            orlando_lunch.add(c.getText().toString());
        }
        else
            orlando_lunch.remove(c.getText().toString());

    } public static void orlando_dinner(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            orlando_dinner.add(c.getText().toString());
        }
        else
            orlando_dinner.remove(c.getText().toString());

    }
    public  void itineraryfab(View v){

        Intent intent = new Intent(this, Orlando_Scrolling.class);
        startActivity(intent);
    }
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
          //  return PlaceholderFragment.newInstance(position + 1);
            if(position == 0) // if the position is 0 we are returning the First tab
            {
                tab1 tab1 = new tab1();
                return tab1;
            }
            if (position == 1)             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
            {
                tab2 tab2 = new tab2();
                return tab2;
            }
            else{
                tab3 tab3 = new tab3();
                return tab3;

            }

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Morning";
                case 1:
                    return "Afternoon";
                case 2:
                    return "Evening";
            }
            return null;
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static Fragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
           return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_activity_list, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            return rootView;
        }
    }
}
