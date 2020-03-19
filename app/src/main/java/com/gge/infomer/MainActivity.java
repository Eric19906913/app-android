package com.gge.infomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EdtUser, EdtPass;
    Button BtnLog;
    RadioButton RbPerson, RbEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdtUser = (EditText) findViewById(R.id.EdtUser);
        EdtPass = (EditText) findViewById(R.id.EdtPass);
        BtnLog = (Button) findViewById(R.id.BtnLog);
        RbPerson = (RadioButton) findViewById(R.id.RbPerson);
        RbEnter = (RadioButton) findViewById(R.id.RbEnterprise);
    }


    public void ingreso(View view) {
        String nombre = EdtUser.toString();
        if(!nombre.isEmpty()){
            Toast.makeText(this,nombre,Toast.LENGTH_LONG);
        }else{
            Toast.makeText(this,"No ingreso nombre",Toast.LENGTH_LONG);
        }

    }
}
