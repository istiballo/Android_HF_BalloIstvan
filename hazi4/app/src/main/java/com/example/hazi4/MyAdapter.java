package com.example.hazi4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.DecimalFormat;


public class MyAdapter extends ArrayAdapter {
    private final Activity context;
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private Penznem[] penznemek;



    public MyAdapter(@NonNull Activity context, Penznem[] penznemek) {
        super(context, R.layout.penznem_layout,penznemek);
        this.context= context;
        this.penznemek = penznemek;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.penznem_layout, null,true);

        ImageView flagView = rowView.findViewById(R.id.imageView);
        TextView rovidNev = rowView.findViewById(R.id.rovidNev);
        TextView hosszuNev = rowView.findViewById(R.id.hosszuNev);
        TextView vetelTV = rowView.findViewById(R.id.vetelTextView);
        TextView eladasTV = rowView.findViewById(R.id.eladasTextView);

        flagView.setImageResource(penznemek[position].getKepId());
        rovidNev.setText(penznemek[position].getRovidNev());
        hosszuNev.setText(penznemek[position].getNev());
        vetelTV.setText(decimalFormat.format(penznemek[position].getVetelAr()) + " RON");
        eladasTV.setText(decimalFormat.format(penznemek[position].getEladasiAr()) + " RON");

        return rowView;
    }
}
