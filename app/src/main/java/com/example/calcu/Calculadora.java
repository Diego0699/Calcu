package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    TextView lblUser,txtOperacion,txtConcatenar;
    Button btnCero,btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnPunto,btnSuma,btnResta,btnMulti,btnDiv,btnElim,btnResult;

    double numero1, numero2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        lblUser=findViewById(R.id.lblUser);
        txtOperacion=findViewById(R.id.txtOperacion);

        //Atrapar valor
        Intent atraparValor=getIntent();
        String usuario=atraparValor.getStringExtra("DATA");
        lblUser.setText("¡Bienvenido "+ usuario+"!");

        btnCero=findViewById(R.id.btnCero);
        btnUno=findViewById(R.id.btnUno);
        btnDos=findViewById(R.id.btnDos);
        btnTres=findViewById(R.id.btnTres);
        btnCuatro=findViewById(R.id.btnCuatro);
        btnCinco=findViewById(R.id.btnCinco);
        btnSeis=findViewById(R.id.btnSeis);
        btnSiete=findViewById(R.id.btnSiete);
        btnOcho=findViewById(R.id.btnOcho);
        btnNueve=findViewById(R.id.btnNueve);
        btnPunto=findViewById(R.id.btnPunto);
        btnSuma=findViewById(R.id.btnSuma);
        btnResta=findViewById(R.id.btnResta);
        btnMulti=findViewById(R.id.btnMulti);
        btnDiv=findViewById(R.id.btnDiv);
        btnElim=findViewById(R.id.btnElim);
        btnResult=findViewById(R.id.btnResult);

    btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
                txtOperacion.setText(txtConcatenar.getText().toString() + "0");
            }
        });
    btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
                txtOperacion.setText(txtConcatenar.getText().toString() + "1");
            }
        });
    btnDos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "2");
        }
    });
    btnTres.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "3");
        }
    });
    btnCuatro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "4");
        }
    });
    btnCinco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "5");
        }
    });
    btnSeis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "6");
        }
    });
    btnSiete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "7");
        }
    });
    btnOcho.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "8");
        }
    });
    btnNueve.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + "9");
        }
    });
    btnPunto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
            txtOperacion.setText(txtConcatenar.getText().toString() + ".");
        }
    });
    btnSuma.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try{
                operador = "+";
                txtConcatenar = (TextView)findViewById(R.id.txtOperacion);
                numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtOperacion.setText("");
            } catch (Exception e) {
            Toast.makeText(Calculadora.this,"Operacion Invalida!",Toast.LENGTH_SHORT).show();
            }

        }
    });
    btnResta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            try{
                operador = "-";
                txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
                numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtOperacion.setText("");
            }catch (Exception e) {
                Toast.makeText(Calculadora.this,"Operacion Invalida!",Toast.LENGTH_SHORT).show();
            }
        }
    });
    btnMulti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            try{
                operador = "*";
                txtConcatenar = (TextView)findViewById(R.id.txtOperacion);
                numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtOperacion.setText("");
            }catch (Exception e) {
                Toast.makeText(Calculadora.this,"Operacion Invalida!",Toast.LENGTH_SHORT).show();
            }
        }
    });
    btnDiv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            try{
                operador = "/";
                txtConcatenar = (TextView)findViewById(R.id.txtOperacion);
                numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtOperacion.setText("");
            }catch (Exception e) {
                Toast.makeText(Calculadora.this,"Operacion Invalida!",Toast.LENGTH_SHORT).show();
            }
        }
    });
    btnElim.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            numero1 = 0.0;
            numero2 = 0.0;
            txtOperacion.setText("");
        }
    });


    btnResult.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            try {
                txtConcatenar = (TextView) findViewById(R.id.txtOperacion);
                numero2 = Double.parseDouble(txtConcatenar.getText().toString());
                if(operador.equals("+")){
                    txtOperacion.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    txtOperacion.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    txtOperacion.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    txtOperacion.setText("");
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        txtOperacion.setText("Infinito");
                    }
                }
                if ((operador.equals("/") && numero2==0)){

                    Toast.makeText(Calculadora.this,"No se puede divir entre cero!",Toast.LENGTH_SHORT).show();
                }
                txtOperacion.setText(String.valueOf(resultado));
            } catch (Exception e) {
                Toast.makeText(Calculadora.this,"Operacion Invalida!",Toast.LENGTH_SHORT).show();
            }


        }
    });

    }


}