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
        String nombre = EdtUser.getText().toString();
        String pass = EdtPass.getText().toString();
        Boolean opcion;
        Intent intent;
        if(CheckBoxEnterprise.isChecked()){
            opcion = true;
        }else{
            opcion = false;
        }
        if(!nombre.isEmpty() && !pass.isEmpty()){
            if(opcion){
                Toast.makeText(this,"Ingreso correcto de empresa",Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, EnterpriseActivity.class);
            }else {
                Toast.makeText(this, "Ingreso correcto de usuario", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this,"No ingresó sus datos",Toast.LENGTH_SHORT).show();
        }
    }

    public void registrar(View view) {
        Toast.makeText(this, "Ingresando en registrar",Toast.LENGTH_SHORT).show();
    }
}
