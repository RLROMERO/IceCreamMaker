package com.example.icecreammakerjavier_benito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int preciovar = 0;
    int cantidadvar = 0;
    TextView cantidadnum;
    TextView precionum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidadnum = findViewById(R.id.cantidadnum);
        precionum = findViewById(R.id.precionum);
    }
    public void onClickButtonMas(View view) {
        incrementar(cantidadvar);
    }
    public void onClickButtonMenos(View view) {
        decrementar(cantidadvar);
    }
    public void onClickButtonOrder(View view) {
        displayAndCalculatePriceInformation("3", "6");
    }

    public void displayAndCalculatePriceInformation (String cantidad,String precio) {
        cantidadnum.setText(cantidad);
        precionum.setText(precio);
    }
    public void incrementar (Integer cantidadvar) {
        cantidadvar++;
        cantidadnum.setText(cantidadvar);
    }
    public void decrementar (Integer cantidadvar) {
        cantidadvar--;
        cantidadnum.setText(cantidadvar);
    }
}

