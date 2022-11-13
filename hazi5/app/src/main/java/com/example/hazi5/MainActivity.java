package com.example.hazi5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    Szoveg[] listItems = new Szoveg[]{
            new Szoveg(R.color.red, "Piros"),
            new Szoveg(R.color.green, "Zold"),
            new Szoveg(R.color.yellow, "Sarga"),
    };
    ArrayList<Szoveg> list = new ArrayList<Szoveg>(Arrays.asList(listItems));
    SzovegAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(R.id.listView);
        adapter = new SzovegAdapter(this, list);
        registerForContextMenu(listView);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sortOptions:
                list.sort(new Comparator<Szoveg>() {
                    @Override
                    public int compare(Szoveg sz1, Szoveg sz2) {
                        return sz1.getSzoveg().compareTo(sz2.getSzoveg());
                    }
                });
                adapter.notifyDataSetChanged();
                return true;
            case R.id.deleteOption:
                list.removeAll(list);
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}