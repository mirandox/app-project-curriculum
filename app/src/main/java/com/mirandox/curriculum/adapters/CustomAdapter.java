package com.mirandox.curriculum.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mirandox.curriculum.R;
import com.mirandox.curriculum.activities.InformationsActivity;
import com.squareup.picasso.Picasso;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context mContext;
    private Integer[] mImagem;
    private String[] mNome;
    private String[] mEmail;
    private String[] mIdade;
    private String[] mTelefone;
    private String[] mFormacao;
    private String[] mExpProfissional;
    private String[] mQualiComplementares;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView email;
        private ImageView imgView;
        private CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.nome = itemView.findViewById(R.id.nome);
            this.email = itemView.findViewById(R.id.email);
            this.imgView = itemView.findViewById(R.id.img);
            this.cardView = itemView.findViewById(R.id.card);
        }
    }

    public CustomAdapter(Context mContext, Integer[] imagem, String[] nome, String[] email, String[] idade, String[] telefone, String[] formacao, String[] expProfissional, String[] qualiComplementares) {
        this.mContext = mContext;
        this.mImagem = imagem;
        this.mNome = nome;
        this.mEmail = email;
        this.mIdade = idade;
        this.mTelefone = telefone;
        this.mFormacao = formacao;
        this.mExpProfissional = expProfissional;
        this.mQualiComplementares = qualiComplementares;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int i) {
        Picasso.with(mContext).load(mImagem[i]).into(holder.imgView);
        holder.nome.setText(mNome[i]);
        holder.email.setText(mEmail[i]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InformationsActivity.class);
                intent.putExtra("Nome", mNome[i]);
                intent.putExtra("Imagem", mImagem[i]);
                intent.putExtra("Email", mEmail[i]);
                intent.putExtra("Idade", mIdade[i]);
                intent.putExtra("Telefone", mTelefone[i]);
                intent.putExtra("Formacao", mFormacao[i]);
                intent.putExtra("ExpProfissional", mExpProfissional[i]);
                intent.putExtra("QualiComplementares", mQualiComplementares[i]);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNome.length;
    }
}
