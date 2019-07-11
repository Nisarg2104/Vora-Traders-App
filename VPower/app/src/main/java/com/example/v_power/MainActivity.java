package com.example.v_power;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();


        actionBar.setTitle("Vora Traders");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.contact:
            {

            }

            case R.id.place_order:
            {

            }

        }
        return super.onOptionsItemSelected(item);
    }


//Gajjab method che aa
    public void onCategorySelect(View v){
            final View a=v;
            final LinearLayout ll;
            int resId=getResources().getIdentifier("ll"+v.getTag().toString(),"id",getPackageName());
            ll = findViewById(resId);
       final Intent intent = new Intent(MainActivity.this, DisplayCategories.class);
        intent.putExtra("cname",v.getTag().toString());

            ll.setBackgroundColor(getResources().getColor(R.color.onClick));
            double secs = 0.05;
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    startActivity(intent);

                    ll.setBackgroundColor(getResources().getColor(R.color.normal));

                }
            }, (int) (secs * 1000));

        }


}
