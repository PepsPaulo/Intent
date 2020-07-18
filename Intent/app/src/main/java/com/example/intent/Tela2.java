package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Bundle extras = getIntent().getExtras();

        TextView nome = findViewById(R.id.textNome);
        TextView genero = findViewById(R.id.textGen);
        TextView estadocivil = findViewById(R.id.textEstCiv);
        TextView email = findViewById(R.id.textEmail);
        TextView telefone = findViewById(R.id.textTel);
        TextView senha = findViewById(R.id.textSen);

        String n = extras.getString(MainActivity.EXTRA_MESSAGE_NOME);
        String g = extras.getString(MainActivity.EXTRA_MESSAGE_GENERO);
        String ec = extras.getString(MainActivity.EXTRA_MESSAGE_ESTADOCIVIL);
        String e = extras.getString(MainActivity.EXTRA_MESSAGE_EMAIL);
        String t = extras.getString(MainActivity.EXTRA_MESSAGE_TELEFONE);
        String s = extras.getString(MainActivity.EXTRA_MESSAGE_SENHA);
        nome.setText(n);
        genero.setText(g);
        estadocivil.setText(ec);
        email.setText(e);
        telefone.setText(t);
        senha.setText(s);
    }
}
