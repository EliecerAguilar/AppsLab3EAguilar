package com.example.appslab3eaguilar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;


public class SumaActivity extends AppCompatActivity {
    //declaracion de variables
    EditText txtNum1;
    EditText txtNum2;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        //Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        this.InicializarControles();
    }


    private void InicializarControles() {
        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);

        lblResultado = (TextView)findViewById(R.id.lblRes);
    }

    public void SumarNumeros(View view)
    {
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1+n2;

            lblResultado.setText(Integer.toString(resultado));
        }
        catch (Exception e)
        {
            Toast.makeText(this,"Error en la suma de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
/*
@Override
   protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
    }

@Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();
    }

@Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_LONG).show();
    }

@Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_LONG).show();
    }

@Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();
    }
*/

}