package com.example.v_power;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentList extends ListFragment {

    Company lumax=new Company("Lumax"), nrb=new Company("NRB"),makino=new Company("Makino"),unominda=new Company("Uno-Minda"), sparkminda=new Company("Spark-Minda"), skf=new Company("SKF"),fag=new Company("FAG");





    public FragmentList() {
        // Required empty public constructor
        lumax.categories.add(new Company.Category("Hello"));
    }

    @Override
    public void onAttach(Context context) {


        super.onAttach(context);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        String cname=getActivity().getIntent().getExtras().getString("cname").toLowerCase();




        //Assigning Categories to companies
        lumax.Assign(lumax,"Head Light Assy/ H L Glass","Cable","Mirror","Air Filter","Bulb and Halogens","Tail Light Assy","Tail Light Glass","Indicator Assy, Glass and Stay","Stater Relay, Flasher, Buzzer, Horn");
        makino.Assign(makino,"Clutch Plate,Break Shoe, Clutch Hub, Centre, Housing");
        skf.Assign(skf,"Bearings","Grease","Clutch Plate and Oil seals");
        nrb.Assign(nrb,"Kit and Bearings","Steering Cone Sets and Swing Arms");
        sparkminda.Assign(sparkminda,"Lock Kit","Ignition Switch","Wiring Harness, Clutch Plate","Break Shoe");
        unominda.Assign(unominda,"H L B Switch","Buttons","Horn","Sensors","Lever and Yokes");
        fag.Assign(fag,"Kit and Bearings");
        Dictionary CompanyNames = new Hashtable();
        CompanyNames.put("lumax",lumax);
        CompanyNames.put("makino",makino);
        CompanyNames.put("skf",skf);
        CompanyNames.put("nrb",nrb);
        CompanyNames.put("fag",fag);
        CompanyNames.put("unominda",unominda);
        CompanyNames.put("sparkminda",sparkminda);

        ArrayList<String> dataToDisplay=new ArrayList<String>();
        ((Company)CompanyNames.get(cname)).setList((Company)CompanyNames.get(cname),dataToDisplay);

        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, dataToDisplay));

        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}
