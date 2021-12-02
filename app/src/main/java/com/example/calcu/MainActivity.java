package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtUser,txtPassword;
    Button btnIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Hacer match de variable java con widget

        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnIngresar = findViewById(R.id.btnIngresar);


        //Funcionalidad del Click del Boton Ingresar



        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String usuario=txtUser.getText().toString();
               // String password=txtUser.getText().toString();

                //String usuarioBD="Admin";
               // String passwordBD="Admin";
               // if (usuario.equals(usuarioBD) && password.equals(passwordBD)){
                  //  Toast.makeText(MainActivity.this,"Credenciales Correctas!",Toast.LENGTH_LONG).show();

                    Intent i = new Intent(MainActivity.this, Calculadora.class);

                    startActivity(i);


               // }else {
                   // Toast.makeText(MainActivity.this,"Usuario o Contraseña Incorrecta!",Toast.LENGTH_SHORT).show();
               // }
          }
       });
    }

}