package com.example.administrador.holamundo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HolaMundo extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        b= (Button) findViewById(R.id.b1);

        /* Vamos a poner primero el listener en el propio
           boton mediante una CLASE ANONIMA
         */
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LinearLayout ll= (LinearLayout) findViewById(R.id.activity_hola_mundo);
                        ll.setBackgroundColor(Color.YELLOW);
                    }
                }
        );
    }
}
