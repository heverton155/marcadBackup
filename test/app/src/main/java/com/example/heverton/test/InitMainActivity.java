package com.example.heverton.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

public class InitMainActivity extends AppCompatActivity {

    private ListView lista_venceram;
    private ImageButton Bt_Acougue;
    private ImageButton Bt_Bebidas;
    private ImageButton Bt_Frios;
    private ImageButton Bt_Higiene;
    private ImageButton Bt_Hortifruti;
    private ImageButton Bt_Mercearia;
    private ImageButton Bt_Padaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init_main);
    }
}
