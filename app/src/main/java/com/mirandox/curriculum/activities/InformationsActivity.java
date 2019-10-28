package com.mirandox.curriculum.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mirandox.curriculum.R;

public class InformationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

        TextView nomePessoa= findViewById(R.id.nomePessoa);
        ImageView imagemPessoa = findViewById(R.id.imgPessoa);
        TextView emailPessoa = findViewById(R.id.emailPessoa);
        TextView idadePessoa = findViewById(R.id.idadePessoa);
        TextView telefonePessoa = findViewById(R.id.telefonePessoa);
        TextView formacaoPessoa = findViewById(R.id.formacaoPessoa);
        TextView experienciaPessoa = findViewById(R.id.experienciaPessoa);
        TextView qualificacaoPessoa = findViewById(R.id.qualificacaoPessoa);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("Nome");
        int imagem = intent.getIntExtra("Imagem", 1);
        String email = intent.getStringExtra("Email");
        String idade = intent.getStringExtra("Idade");
        String telefone = intent.getStringExtra("Telefone");
        String formacao = intent.getStringExtra("Formacao");
        String experiencia = intent.getStringExtra("ExpProfissional");
        String qualificacao = intent.getStringExtra("QualiComplementares");

        nomePessoa.setText(nome);
        imagemPessoa.setImageResource(imagem);
        emailPessoa.setText(email);
        idadePessoa.setText(idade);
        telefonePessoa.setText(telefone);
        formacaoPessoa.setText(formacao);
        experienciaPessoa.setText(experiencia);
        qualificacaoPessoa.setText(qualificacao);
    }
}
