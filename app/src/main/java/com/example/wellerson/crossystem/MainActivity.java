package com.example.wellerson.crossystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ViewHolder nViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nViewHolder.tvUsuario = (TextView) findViewById(R.id.tv_usuario);
        this.nViewHolder.etUsuario = (EditText) findViewById(R.id.et_usuario);
        this.nViewHolder.tvSenha = (TextView) findViewById(R.id.tv_senha);
        this.nViewHolder.etSenha = (EditText) findViewById(R.id.et_senha);
        this.nViewHolder.tvUnidadeUsuario = (TextView) findViewById(R.id.tv_unidade_usuario);
        this.nViewHolder.etUnidadeUsuario = (EditText) findViewById(R.id.et_unidade_usuario);
        this.nViewHolder.bBotao = (Button) findViewById(R.id.b_botao);


        this.nViewHolder.bBotao.setOnClickListener(this); //incluindo onClick no botao
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.b_botao){ //fazendo o onClick para passar para a outra tela
            if(nViewHolder.etUsuario.getText().toString().equals("cross") && nViewHolder.etSenha.getText().toString().equals("123") && nViewHolder.etUnidadeUsuario.getText().toString().equals("000")){
                Toast.makeText(this, "Bem Vindo", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, DetalhesActivity.class);
                startActivity(intent);

            }
        }
    }

    public static class ViewHolder{
        TextView tvUsuario;
        EditText etUsuario;
        TextView tvSenha;
        EditText etSenha;
        TextView tvUnidadeUsuario;
        EditText etUnidadeUsuario;
        Button  bBotao;
    }
}
