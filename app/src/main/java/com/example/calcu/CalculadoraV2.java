package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraV2 extends AppCompatActivity {
     Button btnSuma2;
     Button btnResta2;
     Button btnMulti2;
     Button btnDiv2;
     Button btnLimpiar2;

     TextView txtResultados;
     TextView txtNumero1;
     TextView txtNumero2;
     TextView lblUser2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_v2);
        //botones operaciones
        btnSuma2=findViewById(R.id.btnSuma2);
        btnResta2=findViewById(R.id.btnResta2);
        btnMulti2=findViewById(R.id.btnMulti2);
        btnDiv2=findViewById(R.id.btnDiv2);
        btnLimpiar2=findViewById(R.id.btnLimpiar2);

        //txt Widges
        txtResultados=findViewById(R.id.txtResultados);
        txtNumero1=findViewById(R.id.txtNumero1);
        txtNumero2=findViewById(R.id.txtNumero2);
        lblUser2=findViewById(R.id.lblUser2);

        //Atrapar valor
        Intent atraparValor=getIntent();
        String usuario = atraparValor.getStringExtra("DATA2");
        lblUser2.setText("¡Bienvenido "+ usuario+"!" );




        btnSuma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtResultados.setText( suma(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");
            }
        });
        btnResta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultados.setText( resta(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");

            }
        });
        btnMulti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultados.setText( multiplicacion(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");
            }
        });
        btnDiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultados.setText( division(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");

            }
        });
        btnLimpiar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultados.setText("");
                txtNumero1.setText("");
                txtNumero2.setText("");

            }
        });



    }

    public double suma(int a, int b){
        return a+b;
    }
    public double resta(int a, int b){
        return a-b;
    }
    public double multiplicacion(int a, int b){
        return a*b;
    }
    public double division(int a, int b){
        int respuesta=0;
        if (b!=0){
            respuesta=a/b;
        }else{
            Toast.makeText(CalculadoraV2.this ,"No se puede divir entre cero!",Toast.LENGTH_SHORT).show();
        }
        return respuesta;
    }
}