package com.loteria.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private EditText correo;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText) findViewById(R.id.correo);
        password = (EditText) findViewById(R.id.pasword);


        button = (Button)findViewById(R.id.boton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.boton){
            String t = password.getText().toString();
            //t.trim();
            if(t.length() >= 6){
                //Si el texto introducido no es vacio
                    Intent intent = new Intent(this, ListaActivity.class);
                    startActivity(intent);
            }else {
                //si el texto introducido es vacío.
                Toast.makeText(this, "Necesita una contraseña de 6 caracters",Toast.LENGTH_LONG).show();

            }
        }
    }


}
