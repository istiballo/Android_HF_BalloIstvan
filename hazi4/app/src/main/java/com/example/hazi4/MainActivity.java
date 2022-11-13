package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Penznem[] penznemek = {
            new Penznem(R.drawable.huf,"HUF","Forint",0.70,0.63),
            new Penznem(R.drawable.us,"USD","US Dollar",4.7,4.5),
            new Penznem(R.drawable.uk,"GBP","British Pound",5.20,4.99),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter myAdapter = new MyAdapter(this, penznemek);
        ListView currencyListView = findViewById(R.id.listView);
        currencyListView.setAdapter(myAdapter);

    }


}