package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_NOME = "com.example.intent.NOME";
    public final static String EXTRA_MESSAGE_GENERO = "com.example.intent.GENERO";
    public final static String EXTRA_MESSAGE_ESTADOCIVIL = "com.example.intent.ESTADOCIVIL";
    public final static String EXTRA_MESSAGE_EMAIL = "com.example.intent.EMAIL";
    public final static String EXTRA_MESSAGE_TELEFONE = "com.example.intent.TELEFONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PassarInfos(View view) {
        EditText nome = findViewById(R.id.textNome);
        EditText email = findViewById(R.id.textEmail);
        EditText telefone = findViewById(R.id.textTel);
        RadioButton rdb1 = findViewById(R.id.rdb1);
        Spinner spn = findViewById(R.id.spn);
        String p;

        String n = nome.getText().toString();
        String e = email.getText().toString();
        String t = telefone.getText().toString();

        if (rdb1.isChecked())
            p = "Masculino";
        else
            p = "Feminino";

        String sp = spn.getSelectedItem().toString();

        Intent intent = new Intent(MainActivity.this, Tela2.class);
        intent.putExtra(EXTRA_MESSAGE_NOME, "Nome: " + n);
        intent.putExtra(EXTRA_MESSAGE_GENERO, "Gênero: " + p);
        intent.putExtra(EXTRA_MESSAGE_ESTADOCIVIL, "Estado Civil: " + sp);
        intent.putExtra(EXTRA_MESSAGE_EMAIL, "E-mail: " + e);
        intent.putExtra(EXTRA_MESSAGE_TELEFONE, "Telefone: " + t);

        startActivity(intent);
    }
}
