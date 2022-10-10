package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText szam1ET, szam2ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected int[] getSzamok() {
        szam1ET = findViewById(R.id.editTextNumber);
        szam2ET = findViewById(R.id.editTextNumber2);
        int szam1, szam2;
        szam1 = szam2 = 0;
        szam1 = Integer.parseInt(szam1ET.getText().toString());
        szam2 = Integer.parseInt(szam1ET.getText().toString());
        int[] szamok = {szam1,szam2};
        return szamok;
    }
    public void addOssze(View v) {
        int[] szamok = getSzamok();
        int eredmeny = szamok[0]+szamok[1];
        megjelenit(eredmeny);
    }
    public void vondKi(View v) {
        int[] szamok = getSzamok();
        int eredmeny = szamok[0]-szamok[1];
        megjelenit(eredmeny);
    }
    public void szorozd(View v) {
        int[] szamok = getSzamok();
        int eredmeny = szamok[0]*szamok[1];
        megjelenit(eredmeny);
    }
    public void oszdEl(View v) throws Exception {
        int[] szamok = getSzamok();
        if(szamok[1]==0) {
            throw new Exception("Nem osztunk nullaval helo");
        }
        int eredmeny = szamok[0]/szamok[1];
        megjelenit(eredmeny);
    }
    protected void megjelenit(int eredmeny) {
        TextView eredmenyText = findViewById(R.id.textView2);
        eredmenyText.setText(Integer.toString(eredmeny));
    }
}