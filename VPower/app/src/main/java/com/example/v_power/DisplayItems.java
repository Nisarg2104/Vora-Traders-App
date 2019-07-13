package com.example.v_power;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.DataQueryBuilder;

import java.util.List;

public class DisplayItems extends AppCompatActivity {
    ListView lvList;
    private View mProgressView;
    private View mLoginFormView;
    private TextView tvLoad;

    ItemAdapter adapter1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_items);
        lvList=findViewById(R.id.lvList2);

        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
        tvLoad = findViewById(R.id.tvLoad);
        String cname=getIntent().getStringExtra("cname");
        String categoryname=getIntent().getStringExtra("categoryname");
        String whereClause="company = '"+"Lumax"+"'";
        DataQueryBuilder queryBuilder= DataQueryBuilder.create();
        queryBuilder.setWhereClause(whereClause);
        queryBuilder.addSortBy("OEM");
        queryBuilder.setPageSize(96);


        showProgress(true);
        tvLoad.setText("Getting all products...please wait...");


         Backendless.Persistence.of(Product.class).find(queryBuilder, new AsyncCallback<List<Product>>() {
            @Override
            public void handleResponse(List<Product> response) {
                Toast.makeText(DisplayItems.this, "In here", Toast.LENGTH_SHORT).show();
                TestApplication.productlist=response;
                adapter1=new ItemAdapter(DisplayItems.this,response);
                  lvList.setAdapter(adapter1);
                  showProgress(false);



            }

            @Override
            public void handleFault(BackendlessFault fault) {

                Toast.makeText(DisplayItems.this, "Error:"+fault.getMessage(), Toast.LENGTH_SHORT).show();
                showProgress(false);
            }
        });




    }

    /**
     * Shows the progress UI and hides the login form.
     */
  @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
            mLoginFormView.animate().setDuration(shortAnimTime).alpha(
                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
                }
            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });

            tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
            tvLoad.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }


}

