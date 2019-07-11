package com.example.v_power;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Contact extends AppCompatActivity {
    ArrayList<String> contactNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        contactNumbers=new ArrayList<String>();
        contactNumbers.add("Ronak Vora: 98253XXXXX");
        contactNumbers.add("Employee2: 93750XXXXX");
        contactNumbers.add("Employee3: 93750XXXXX");
        contactNumbers.add("Employee4: 93750XXXXX");


    }
}
