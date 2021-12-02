package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
    TextView lblUser,txtOperacion;
    Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnSuma,btnResta,btnMulti,btnDiv,btnElim,btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        lblUser=findViewById(R.id.lblUser);
        btnUno =findViewById(R.id.btnUno);
        btnDos =findViewById(R.id.btnDos);
        btnTres =findViewById(R.id.btnTres);
        btnCuatro =findViewById(R.id.btnCuatro);
        btnCinco =findViewById(R.id.btnCinco);
        btnSeis =findViewById(R.id.btnSeis);
        btnSiete =findViewById(R.id.btnSiete);
        btnOcho =findViewById(R.id.btnOcho);
        btnNueve =findViewById(R.id.btnNueve);
        btnSuma =findViewById(R.id.btnSuma);
        btnResta =findViewById(R.id.btnResta);
        btnMulti =findViewById(R.id.btnMulti);
        btnDiv =findViewById(R.id.btnDiv);
        btnElim =findViewById(R.id.btnElim);
        btnResult =findViewById(R.id.btnResult);
        txtOperacion=findViewById(R.id.txtOperacion);

        lblUser.setText("Bienvenido Admin");
        float numero1=0;
        float numero2=0;
        String operacion="";

        //Funciones de cada boton
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"1");
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"4");            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText(txtOperacion.getText()+"8");
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("+");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("-");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("/");
            }
        });
        btnElim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("0");
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }
    public int suma(int a,int b){
        return a+b;
    }
    public int resta(int a,int b){
        return a-b;
    }
    public int multipicacion(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        return a/b;
    }
}