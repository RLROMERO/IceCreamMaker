package com.example.icecreammakerjavier_benito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        mas = (Button)findViewById(R.id.menos);
        menos = (Button)findViewById(R.id.mas);
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidadvar < 10) {
                cantidadvar++;
                cantidadnum.setText(String.valueOf(cantidadvar));
                    precio();} else {
                    Toast mayor = Toast.makeText(getApplicationContext(),"No puedes comprar mas de 10 helados", Toast.LENGTH_SHORT);
                    mayor.show();
                }
            }});

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidadvar > 0) {
                cantidadvar--;
                cantidadnum.setText(String.valueOf(cantidadvar));
                precio();
                ;} else {
                    Toast menor = Toast.makeText(getApplicationContext(),"No puedes comprar helados negativos", Toast.LENGTH_SHORT);
                menor.show();
                }
            }});

    }
    public void onClickButtonOrder(View view) {
        Toast.makeText(getApplicationContext(),"Pedido Realizado", Toast.LENGTH_SHORT).show();
    }

    public void precio () {
        preciovar = cantidadvar * 3;
        precionum.setText(preciovar+"€");
    }
}

