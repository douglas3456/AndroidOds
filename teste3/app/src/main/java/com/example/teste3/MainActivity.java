package com.example.teste3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btno1, btno2, btno3, btno4, btno5, btno6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BOTAO ODS1
        btno1 = findViewById(R.id.btno1);
        btno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent( getApplicationContext(), Ods1Activity2.class);
            }
        });

        //Botao ODS2
        btno2 = findViewById(R.id.btno2);
        btno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS2 = new Intent(getApplicationContext(), ods2Activity2.class);
            }
            });
        

    }
}