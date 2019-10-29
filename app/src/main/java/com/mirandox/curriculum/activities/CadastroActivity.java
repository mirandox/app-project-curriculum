package com.mirandox.curriculum.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.mirandox.curriculum.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText editTxtNome;
    private EditText editTxtEmail;
    private EditText editTxtIdade;
    private EditText editTxtTelefone;
    private EditText editTxtFormacao;
    private EditText editTxtExperiencia;
    private EditText editTxtQualificacao;
    private Button btnCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editTxtNome = findViewById(R.id.editTxtNome);
        editTxtEmail = findViewById(R.id.editTxtEmail);
        editTxtIdade = findViewById(R.id.editTxtIdade);
        editTxtTelefone = findViewById(R.id.editTxtTelefone);
        editTxtFormacao = findViewById(R.id.editTxtFormacao);
        editTxtExperiencia = findViewById(R.id.editTxtExperiencia);
        editTxtQualificacao = findViewById(R.id.editTxtQualificacao);
        btnCadastrar = findViewById(R.id.btnCadastrar);
    }

    public void CadastrarCurriculo(View view) {
        String nome = editTxtNome.getText().toString();
        String email = editTxtEmail.getText().toString();
        String idade = editTxtIdade.getText().toString();
        String telefone = editTxtTelefone.getText().toString();
        String formacao = editTxtFormacao.getText().toString();
        String experiencia = editTxtExperiencia.getText().toString();
        String qualificacao = editTxtQualificacao.getText().toString();

        Intent intent = new Intent(this, CardsActivity.class);
        intent.putExtra("Nome", nome);
        intent.putExtra("Imagem", 1);
        intent.putExtra("Email", email);
        intent.putExtra("Idade", idade);
        intent.putExtra("Telefone", telefone);
        intent.putExtra("Formacao", formacao);
        intent.putExtra("ExpProfissional", experiencia);
        intent.putExtra("QualiComplementares", qualificacao);
        startActivity(intent);
    }
}
