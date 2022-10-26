package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] penzNemek  = {"EUR", "USD", "HUF"};
    float[] vetelArak = {4.6f,4.2f,0.0136f};
    float[] adasArak = {5f,4.8f,0.0146f};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, penzNemek);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id)
            {
                Toast.makeText(MainActivity.this, parent.getItemAtPosition(position).toString() + ", vetel: " + vetelArak[position] + " , adas: " + adasArak[position], Toast.LENGTH_SHORT).show();
            }
        });
    }


}