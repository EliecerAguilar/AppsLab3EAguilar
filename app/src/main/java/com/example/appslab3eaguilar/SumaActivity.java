package com.example.appslab3eaguilar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SumaActivity extends AppCompatActivity {
    //declaracion de variables
    private EditText txtNum1;
    private EditText txtNum2;
    private TextView lblResultado;
    private Spinner spn;

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
        spn = (Spinner) findViewById(R.id.spn1)
        //lista de datos a mostrar en el spinner
        List<String> Spn_op = new ArrayList<>();
        Spn_op.add("Sumar");
        Spn_op.add("Restar");
        Spn_op.add("Multiplicar");
        Spn_op.add("Dividir");
        Spn_op.add("Residuo");

        //adaptador de los valores del arrayList a la spinner
        ArrayAdapter<String> AdapterList1 =new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Spn_op);


    }

    public void SumarNumeros(View view){
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1+n2;

            lblResultado.setText(Integer.toString(resultado));
        }
        catch (Exception e){
            Toast.makeText(this,"Error en la suma de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void RestarNumeros(View view){
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1-n2;

            lblResultado.setText(Integer.toString(resultado));
        }
        catch (Exception e){
            Toast.makeText(this,"Error en la resta de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void MultiplicarNumeros(View view){
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1*n2;

            lblResultado.setText(Integer.toString(resultado));
        }
        catch (Exception e){
            Toast.makeText(this,"Error en la suma de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void DividirNumeros(View view){
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1/n2;

            if(n2 == 0) {
                throw new ArithmeticException("Division by zero!");
            }
            lblResultado.setText(Integer.toString(resultado));

        }
        catch (Exception e)
        {
            Toast.makeText(this,"Error en la division de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void ResiduosNumeros(View view){
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1%n2;

            if(n2 == 0) {
                throw new ArithmeticException("Division by zero!");
            }
            lblResultado.setText(Integer.toString(resultado));

        }
        catch (Exception e)
        {
            Toast.makeText(this,"Error en la division de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
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