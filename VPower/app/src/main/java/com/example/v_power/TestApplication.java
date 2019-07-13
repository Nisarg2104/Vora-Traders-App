package com.example.v_power;

import android.app.Application;
import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class TestApplication extends Application {

        public static final String APPLICATION_ID = "EACC6913-C5EC-BC0F-FF2E-38E1B808F800";
        public static final String API_KEY = "EA713050-1135-4034-A97F-D4D18DB21E62";
        public static final String SERVER_URL = "http://api.backendless.com";


        public static BackendlessUser user;
        public static List<Product> productlist;
        public static ArrayList<Product> cart=new ArrayList<Product>();
        





    Company lumax=new Company("Lumax"), nrb=new Company("NRB"),makino=new Company("Makino"),unominda=new Company("Uno-Minda"), sparkminda=new Company("Spark-Minda"), skf=new Company("SKF"),fag=new Company("FAG");

    Dictionary CompanyNames = new Hashtable();

    @Override
    public void onCreate() {
        //Assigning Categories to companies
        lumax.Assign(lumax,"Head Light Assy/ H L Glass","Cable","Mirror","Air Filter","Bulb and Halogens","Tail Light Assy","Tail Light Glass","Indicator Assy, Glass and Stay","Stater Relay, Flasher, Buzzer, Horn");
        makino.Assign(makino,"Clutch Plate,Break Shoe, Clutch Hub, Centre, Housing");
        skf.Assign(skf,"Bearings","Grease","Clutch Plate and Oil seals");
        nrb.Assign(nrb,"Kit and Bearings","Steering Cone Sets and Swing Arms");
        sparkminda.Assign(sparkminda,"Lock Kit","Ignition Switch","Wiring Harness, Clutch Plate","Break Shoe");
        unominda.Assign(unominda,"H L B Switch","Buttons","Horn","Sensors","Lever and Yokes");
        fag.Assign(fag,"Kit and Bearings");

        CompanyNames.put("lumax",lumax);
        CompanyNames.put("makino",makino);
        CompanyNames.put("skf",skf);
        CompanyNames.put("nrb",nrb);
        CompanyNames.put("fag",fag);
        CompanyNames.put("unominda",unominda);
        CompanyNames.put("sparkminda",sparkminda);
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
        cart.clear();
        super.onCreate();
    }
}
