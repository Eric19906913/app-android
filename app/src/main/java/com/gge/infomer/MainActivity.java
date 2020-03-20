package com.gge.infomer;

import androidx.appcompat.app.AppCompatActivity;

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
        if(!nombre.isEmpty()){
            Toast.makeText(this,"Prueba de que muestre el nombre: "+nombre,Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"No ingreso nombre",Toast.LENGTH_LONG).show();
        }

    }
}
