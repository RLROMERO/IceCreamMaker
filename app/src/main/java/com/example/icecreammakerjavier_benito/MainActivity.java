package com.example.icecreammakerjavier_benito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView cantidadnum;
    TextView precionum;
    Button mas;
    Button menos;
    private int preciovar = 0;
    private int cantidadvar = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidadnum = findViewById(R.id.cantidadnum);
        precionum = findViewById(R.id.precionum);
        mas = (Button)findViewById(R.id.mas);
        menos = (Button)findViewById(R.id.menos);

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadvar++;
                cantidadnum.setText(String.valueOf(cantidadvar));
                precio();
            }});
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadvar--;
                cantidadnum.setText(String.valueOf(cantidadvar));
                precio();
            }});

    }
    public void onClickButtonOrder(View view) {
        displayAndCalculatePriceInformation("3", "6");
    }

    public void displayAndCalculatePriceInformation (String cantidad,String precio) {
        cantidadnum.setText(cantidad);
        precionum.setText(precio);
    }
    public void precio () {
        preciovar = cantidadvar * 3;
        precionum.setText(preciovar+"");
    }
}

