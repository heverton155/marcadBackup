package com.example.heverton.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText email_entrada;
    private EditText pass_entrada;
    private TextView cadastro_user;
    private Button BT_Entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Interface de login
        cadastro_user = (TextView) findViewById(R.id.ID_Text_Cadastro_User);
        cadastro_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Abre a pagina de cadastro user

            }
        });

        BT_Entrar = (Button) findViewById(R.id.ID_BT_Entrada);
        BT_Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Verificar login e abrir o menu do usuario
                Intent intent = new Intent(MainActivity.this, InitMainActivity.class);
                startActivity(intent);
            }
        });

    }
}
