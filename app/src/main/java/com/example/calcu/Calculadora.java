package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    TextView lblUser,txtOperacion;

    float numero1=0.0f;
    float numero2=0.0f;
    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        lblUser=findViewById(R.id.lblUser);
        txtOperacion=findViewById(R.id.txtOperacion);
        lblUser.setText("Bienvenido Admin");


    }
    public void MostarUno(View view) {
         numero1=Float.parseFloat(txtOperacion.getText().toString()+ "");
        if (numero1 == 0.0f){
          txtOperacion.setText("1");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "1");
            numero1 = Float.parseFloat(txtOperacion.getText().toString()+"");
        }

    }
    public void MostarDos(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("2");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "2");
        }
    }

    public void MostarTres(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("3");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "3");
        }
    }
    public void MostarCuatro(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("4");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "4");
        }
    }
    public void MostarCinco(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("5");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "5");
        }
    }
    public void MostarSeis(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("6");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "6");
        }
    }
    public void MostarSiete(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("7");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "7");
        }
    }
    public void MostarOcho(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("8");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "8");
        }
    }
    public void MostarNueve(View view) {
        numero1=Float.parseFloat(txtOperacion.getText().toString());
        if (numero1 == 0.0f){
            txtOperacion.setText("9");
        }else{
            txtOperacion.setText(txtOperacion.getText() + "9");
        }
    }

    public void Limpiar(View view) {
        txtOperacion.setText("0");
    }
    public void OpDividir(View view) {
        numero1 = Float.parseFloat(txtOperacion.getText().toString());
        operacion="/";
        txtOperacion.setText("0");
    }

    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(txtOperacion.getText().toString());
        if (operacion.equals("/") ){
            if (numero2 == 0) {
                txtOperacion.setText("0");
                Toast.makeText(this,"Operacion no valida!",Toast.LENGTH_LONG).show();
            }else{
                float result= numero1/numero2;
                txtOperacion.setText(result + "");
            }
        }
    }



}