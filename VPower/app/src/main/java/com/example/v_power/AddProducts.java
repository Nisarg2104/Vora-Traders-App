package com.example.v_power;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.local.UserIdStorageFactory;

public class AddProducts extends AppCompatActivity {

    TextView etName, etCompany, etPrice, etstdpkg, etMOQ, etCategory, etItemCode;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_products);


        etName = findViewById(R.id.etName);
        etCompany = findViewById(R.id.etCompany);
        etPrice = findViewById(R.id.etPrice);
        etstdpkg = findViewById(R.id.etStdPkg);
        etMOQ = findViewById(R.id.etMoq);
        etCategory = findViewById(R.id.etCategory);
        etItemCode = findViewById(R.id.etItemCode);
        btnAdd = findViewById(R.id.btnAdd);


    }

    public void addit(View v){

        String name = etName.getText().toString(), category = etCategory.getText().toString(), itemcode = etItemCode.getText().toString();
        String company = etCompany.getText().toString();
        String price = etPrice.getText().toString().trim();
        String stdpkg = etstdpkg.getText().toString(), moq = etMOQ.getText().toString();
        Product newproduct = new Product();
        newproduct.setCategoryName(category);
        newproduct.setCompany(company);
        newproduct.setItemCode(itemcode);
        newproduct.setMOQ(moq);
        newproduct.setPrice(price);
        newproduct.setStdpkg(stdpkg);
        newproduct.setName(name);




        Backendless.Persistence.save(newproduct, new AsyncCallback<Product>() {
            @Override
            public void handleResponse(Product response) {
                Toast.makeText(AddProducts.this, "New Product added", Toast.LENGTH_SHORT).show();
                etName.setText("");
                etCategory.setText("");
                etCompany.setText("");
                etItemCode.setText("");
                etMOQ.setText("");
                etPrice.setText("");
                etstdpkg.setText("");


            }

            @Override
            public void handleFault(BackendlessFault fault) {
                Toast.makeText(AddProducts.this, "Error:" + fault.getMessage(), Toast.LENGTH_SHORT).show();


            }
        });
    }
        }
