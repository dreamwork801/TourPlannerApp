package com.example.jorge.tour_planner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link tampa_tab3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link tampa_tab3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tampa_tab3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static ArrayList<String> getTampa_dinner() {
        return tampa_dinner;
    }

    private static ArrayList<String>  tampa_dinner= new ArrayList<String>();

    public static ArrayList<String> getTampa_dinner_activity() {
        return tampa_dinner_activity;
    }

    private static ArrayList<String>  tampa_dinner_activity = new ArrayList<String>();


    public static void tampa_dinner_activity(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            tampa_dinner_activity.add(c.getText().toString());
        }
        else
            tampa_dinner_activity.remove(c.getText().toString());
    }
    public static void tampa_dinner(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()) {
            c.getText();
            tampa_dinner.add(c.getText().toString());
        }
        else
            tampa_dinner.add(c.getText().toString());

    }



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.tampafab);;
    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tampa_tab3.
     */
    // TODO: Rename and change types and number of parameters
    public static tampa_tab3 newInstance(String param1, String param2) {
        tampa_tab3 fragment = new tampa_tab3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public tampa_tab3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        fab = (FloatingActionButton)  getActivity().findViewById(R.id.tampafab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(view.getContext(), Tampa_ScrollingActivity.class);
//                startActivity(intent);
//            }
//        });



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), Tampa_ScrollingActivity.class);
                startActivity(intent);
            }
        });
        return inflater.inflate(R.layout.fragment_tampa_tab3, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
