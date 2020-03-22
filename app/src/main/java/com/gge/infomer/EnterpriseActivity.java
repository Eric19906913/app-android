package com.gge.infomer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EnterpriseActivity extends AppCompatActivity {

    TextView txtMensaje;
    Spinner spNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterprise);

        spNombres = (Spinner) findViewById(R.id.SpNombres);

        ArrayList<String> nombres = new ArrayList<String>();
        //Prueba para llenar un array list y ponerlo en combobox
        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Coronavirus");
        //se puede llenar el array con un for tambien que es lo que vamos a usar trayendo desde la bdd
        //Se crea un array adapter

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,nombres);
        spNombres.setAdapter(adapter);

        spNombres.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //para mostrar lo que se selecciona en un toast
                Toast.makeText(parent.getContext(),"Selecciono: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        txtMensaje = (TextView) findViewById(R.id.TxtMensaje);
        Bundle datos = this.getIntent().getExtras();

        if(datos!=null) {
            String nombre = datos.getString("nombre");
            txtMensaje.setText("Bienvenido: "+nombre);
        }
    }

    public void volver(View view) { //en volver se destruye la actividad actual para que no quede en la cola
        finish();
    }
}
