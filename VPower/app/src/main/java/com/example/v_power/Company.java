package com.example.v_power;
import java.util.*;
;
import java.io.*;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Locale;

public class Company {
    public String name;
    public static class Category{
        public String name;
        public ArrayList<Product> products=new ArrayList<Product>();


        public Category() {
        }

        public Category(String name) {
            this.name = name;
        }

    }
   public ArrayList<Category> categories=new ArrayList<Category>();

    public void Assign(Company c,String ...a){
        c.categories.clear();
        for(String i:a)
            c.categories.add(new Category(i));

    }

    public void setList(Company c,ArrayList<String> a)
    {
        a.clear();
        for(int i=0; i<c.categories.size();i++)
            a.add(c.categories.get(i).name);

    }









    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



