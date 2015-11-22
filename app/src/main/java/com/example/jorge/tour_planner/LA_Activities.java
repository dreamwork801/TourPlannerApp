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


public class LA_Activities extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */


    public static ArrayList<String> getla_dinner() {
        return la_dinner;
    }



    public static ArrayList<String> getla_dinner_activity() {
        return la_dinner_activity;
    }


    public static ArrayList<String> getla_lunch() {
        return la_lunch;
    }

    public static ArrayList<String> getla_breakfast_activity() {
        return la_breakfast_activity;
    }

    public static ArrayList<String> getla_lunch_activity() {
        return la_lunch_activity;
    }

    public static ArrayList<String> getla_breakfast() {
        return la_breakfast;
    }

    private static ArrayList<String>  la_breakfast= new ArrayList<String>();
    private static ArrayList<String>  la_lunch= new ArrayList<String>();
    private static ArrayList<String>  la_dinner= new ArrayList<String>();

    private static ArrayList<String>  la_breakfast_activity = new ArrayList<String>();
    private static ArrayList<String>  la_lunch_activity = new ArrayList<String>();
    private static ArrayList<String>  la_dinner_activity = new ArrayList<String>();


    public static void la_breakfast_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            la_breakfast_activity.add(c.getText().toString());
        }
        else
            la_breakfast_activity.remove(c.getText().toString());
    }


    public static void la_lunch_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            la_lunch_activity.add(c.getText().toString());
        }
        else
            la_lunch_activity.remove(c.getText().toString());
    }

    public static void la_dinner_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            la_dinner_activity.add(c.getText().toString());
        }
        else
            la_dinner_activity.remove(c.getText().toString());
    }



    public static void la_breakfast(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            la_breakfast.add(c.getText().toString());
        }
        else
            la_breakfast.remove(c.getText().toString());

    } public static void la_lunch(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            la_lunch.add(c.getText().toString());
        }
        else
            la_lunch.remove(c.getText().toString());

    } public static void la_dinner(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            la_dinner.add(c.getText().toString());
        }
        else
            la_dinner.remove(c.getText().toString());

    }
    public  void itineraryfab(View v){

        Intent intent = new Intent(this, La_Scrolling.class);
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
                la_tab1 tab1 = new la_tab1();
                return tab1;
            }
            if (position == 1)             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
            {
                la_tab2 tab2 = new la_tab2();
                return tab2;
            }
            else{
                la_tab3 tab3 = new la_tab3();
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
