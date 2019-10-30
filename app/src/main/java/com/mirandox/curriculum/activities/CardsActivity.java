package com.mirandox.curriculum.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mirandox.curriculum.R;
import com.mirandox.curriculum.adapters.CustomAdapter;
import com.mirandox.curriculum.domain.Pessoa;

public class CardsActivity extends AppCompatActivity {

    Pessoa pessoa1 = new Pessoa("Felipe Miranda da Silva", "22", "felipe.miranda@gmail.com", "(11) 97713-7435",
            "Ciência da Computação", "Desenvolvedor Back-end Jr", "Formação Java e Python");

    Pessoa pessoa2 = new Pessoa("Felipe Miranda Soares", "21", "felipe.soares@gmail.com", "(11) 97521-1427",
            "Ciência da Computação", "Desenvolvedor ASP .NET", "ASP .NET Core");

    Pessoa pessoa3 = new Pessoa("Felipe Moura da Silva", "20", "felipe.moura@gmail.com", "(11) 96775-6061",
            "Ciência da Computação", "Estagiário em suporte Técnico ", "Formação em UX (alura)");

    Pessoa pessoa4 = new Pessoa("Gabriel Dorneles Pereira da Silva", "21", "gabriel.dorneles@gmail.com", "(11) 98693-6992",
            "Ciência da Computação", "Analista de MIS", "Bootcamp OmniStack - Rocketseat (React e Node)");

    Pessoa pessoa5 = new Pessoa("Leonardo Felipe Pacher", "21", "leonardo.pacher@gmail.com", "(11) 96687-6162",
            "Ciência da Computação", "Analista Funcional/Arquiteto", "Certificado em Salesforce Administrator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        Intent intent = getIntent();

        Integer[] drawableArray = {R.drawable.miranda, R.drawable.oraculo, R.drawable.moura, R.drawable.dornelas, R.drawable.leonardo, R.drawable.user};
        String[] nomeArray = {pessoa1.getNome(), pessoa2.getNome(), pessoa3.getNome(), pessoa4.getNome(), pessoa5.getNome(), intent.getStringExtra("Nome")};
        String[] emailArray = {pessoa1.getEmail(), pessoa2.getEmail(), pessoa3.getEmail(), pessoa4.getEmail(), pessoa5.getEmail(), intent.getStringExtra("Email")};
        String[] idadeArray = {pessoa1.getIdade(), pessoa2.getIdade(), pessoa3.getIdade(), pessoa4.getIdade(), pessoa5.getIdade(), intent.getStringExtra("Idade")};
        String[] telefoneArray = {pessoa1.getTelefone(), pessoa2.getTelefone(), pessoa3.getTelefone(), pessoa4.getTelefone(), pessoa5.getTelefone(), intent.getStringExtra("Telefone")};
        String[] formacaoArray = {pessoa1.getFormacao(), pessoa2. getFormacao(), pessoa3.getFormacao(), pessoa4.getFormacao(), pessoa5.getFormacao(), intent.getStringExtra("Formacao")};
        String[] expProfissionalArray = {pessoa1.getExpProfissional(), pessoa2.getExpProfissional(), pessoa3.getExpProfissional(), pessoa4.getExpProfissional(), pessoa5.getExpProfissional(), intent.getStringExtra("ExpProfissional")};
        String[] qualiComplementaresArray = {pessoa1.getQualiComplementares(), pessoa2.getQualiComplementares(), pessoa3.getQualiComplementares(), pessoa4.getQualiComplementares(), pessoa5.getQualiComplementares(), intent.getStringExtra("QualiComplementares")};

        RecyclerView rv = findViewById(R.id.rv);

        CustomAdapter ad = new CustomAdapter(CardsActivity.this, drawableArray, nomeArray,
                emailArray, idadeArray, telefoneArray, formacaoArray, expProfissionalArray, qualiComplementaresArray);
        rv.setAdapter(ad);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}
