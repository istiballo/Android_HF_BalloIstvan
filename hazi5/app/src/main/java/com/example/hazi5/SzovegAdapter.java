package com.example.hazi5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class SzovegAdapter extends ArrayAdapter<Szoveg> {
    @NonNull
    private final Context context;
    private final ArrayList<Szoveg> resource;

    public SzovegAdapter(@NonNull Context context, ArrayList<Szoveg> resource) {
        super(context, android.R.layout.simple_list_item_1,resource);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView textView = (TextView) super.getView(position, convertView, parent);
        textView.setTextColor(ContextCompat.getColor(getContext(), getItem(position).getSzin()));
        return textView;
    }
}
