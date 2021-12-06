package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtUser,txtPassword;
    Button btnIngresar;
    RadioButton rbCalcuUno,rbCalcuDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Hacer match de variable java con widget

        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

        rbCalcuUno= findViewById(R.id.rbCalcuUno);
        rbCalcuDos= findViewById(R.id.rbCalcuDos);

        //Funcionalidad del Click del Boton Ingresar



        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=txtUser.getText().toString();
                String password=txtPassword.getText().toString();

                //String usuarioBD="Admin";
                String passwordBD="Admin";
                if (password.equals(passwordBD)){
                    if (rbCalcuUno.isChecked()){
                        Intent i = new Intent(MainActivity.this, Calculadora.class);
                        i.putExtra("DATA", usuario);
                        startActivity(i);
                    }else if (rbCalcuDos.isChecked()){
                        Intent i2 = new Intent(MainActivity.this, CalculadoraV2.class);
                        i2.putExtra("DATA2", usuario);
                        startActivity(i2);
                    }else {
                        Toast.makeText(MainActivity.this,"Favor seleccione una Opciòn",Toast.LENGTH_SHORT).show();
                    }

                rbCalcuUno.setChecked(false);
                rbCalcuDos.setChecked(false);

                }else {
                    Toast.makeText(MainActivity.this,"Usuario o Contraseña Incorrecta!",Toast.LENGTH_SHORT).show();
                }
          }
       });
    }

}