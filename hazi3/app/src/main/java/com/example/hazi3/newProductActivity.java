package com.example.hazi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class newProductActivity extends AppCompatActivity {

    public static ArrayList<String> productNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);
        productNames = new ArrayList<>();
    }

    public void addProduct(View v) {
        EditText productName = findViewById(R.id.productNameET);
        if(productName.getText().toString().length() > 0) {
            productNames.add(productName.getText().toString());
        }
        emptyInputLines();

    }

    public void cancelProductAdd(View v) {
       emptyInputLines();
    }

    public void showProducts(View v) {
        TextView productNamesTV = findViewById(R.id.productNamesTV);
        String productNamesString = "Product names: ";
        for(String name : productNames) {
            productNamesString+=name + ", ";
        }

        productNamesTV.setText(productNamesString);
    }


    private void emptyInputLines() {
        EditText productName = findViewById(R.id.productNameET);
        EditText productCode = findViewById(R.id.productCodeET);
        EditText productPrice = findViewById(R.id.productPriceET);

        productName.setText("");
        productCode.setText("");
        productPrice.setText("");
    }
}