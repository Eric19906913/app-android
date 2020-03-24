package com.gge.infomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    TextView edtNombre, edtApellido, edtEmail, edtPass1, edtPass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtNombre = (TextView) findViewById(R.id.edtNombre);
        edtApellido = (TextView) findViewById(R.id.edtApellido);
        edtEmail = (TextView) findViewById(R.id.edtEmail);
        edtPass1 = (TextView) findViewById(R.id.edtPass1);
        edtPass2 = (TextView) findViewById(R.id.edtPass2);
    }

    public void registro(View view) {
        //logica basica para el registro de usuarios.

        String pass1,pass2;
        pass1 = edtPass1.getText().toString();
        pass2 = edtPass2.getText().toString();

        if(pass1.equals(pass2)){
            String nombre, apellido, email;
            nombre = edtNombre.getText().toString();
            apellido = edtApellido.getText().toString();
            email = edtEmail.getText().toString();
            ArrayList<String> usuario = new ArrayList<>();
            usuario.add(nombre);
            usuario.add(apellido);
            usuario.add(email);
            usuario.add(pass1);
            Toast.makeText(this, "Usuario: "+usuario, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        }
    }

    public void registro_ente(View view) {
        //esto deberia llevar a una activity donde se explique como obtener una cuenta.
        Toast.makeText(this,"registro como empresa!",Toast.LENGTH_SHORT).show();
    }

    public void salir(View view) {
        //esto destruye la activity asi no queda en cola
        finish();
    }
}
