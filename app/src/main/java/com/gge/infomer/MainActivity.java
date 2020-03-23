package com.gge.infomer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EdtUser, EdtPass;
    Button BtnLog;
    CheckBox CheckBoxEnterprise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdtUser = (EditText) findViewById(R.id.EdtUser);
        EdtPass = (EditText) findViewById(R.id.EdtPass);
        BtnLog = (Button) findViewById(R.id.BtnLog);
        CheckBoxEnterprise = (CheckBox) findViewById(R.id.checkBoxLogEnterprise);
    }


    public void ingreso(View view) {
        String nombre = EdtUser.getText().toString(); //obtengo el nombre de usuario
        String pass = EdtPass.getText().toString(); //obtengo la pass del user
        Boolean opcion; //es uso de esta variable es MALA LOGICA por lo canceric y redundante... eso me dijo martin JAJAJJAJA
        if(CheckBoxEnterprise.isChecked()){
            opcion = true;

            if(!nombre.isEmpty() && !pass.isEmpty()){
                if(opcion){
                    Toast.makeText(this,"Ingreso correcto de empresa",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, EnterpriseActivity.class);

                    Bundle datos = new Bundle(); //creo un bundle
                    datos.putString("nombre",nombre); // agrego el nombre recibido al bundle

                    intent.putExtras(datos); //agrego el bundle al intent

                    startActivity(intent); //cambia de activity y mando el intent
                }else {
                    Toast.makeText(this, "Ingreso incorrecto de Empresa", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this,"No ingresó sus datos",Toast.LENGTH_SHORT).show();
            }

        }else if(!CheckBoxEnterprise.isChecked()) {

            if (!nombre.isEmpty() && !pass.isEmpty()) {
                Toast.makeText(this, "Ingreso correcto de Usuario", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, UserNavDrawActivity.class);

                Bundle datos = new Bundle(); //creo un bundle
                datos.putString("Nombre", nombre); // agrego el nombre recibido al bundle

                intent.putExtras(datos); //agrego el bundle al intent

                startActivity(intent); //cambia de activity y mando el intent
            } else {
                Toast.makeText(this, "No ingresó sus datos", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void registrar(View view) {
        Toast.makeText(this, "Ingresando en registrar",Toast.LENGTH_SHORT).show();
    }
}
