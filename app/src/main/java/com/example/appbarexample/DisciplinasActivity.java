package com.example.appbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DisciplinasActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listViewDisp;  //ListView para as opções
    private ArrayAdapter adapter;
    private ArrayList<String> listaDados;  //lista com os itens do ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas);
        listViewDisp = findViewById(R.id.listViewDisp);

        preecherLista();//Metodo para criar a lista de conteudo
        preencherAdapter();//Metodo para colocar a lista de conteudo no formato do Adapter



        listViewDisp.setOnItemClickListener(this);//Coloca no ListView o metodo de selecionar o item com o clique
    }

    private void preencherAdapter() {


        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, listaDados);
        listViewDisp.setAdapter(adapter);// preenche a ListView com o Adapter

    }

    private void preecherLista() {

        listaDados = new ArrayList<>();
        listaDados.add("Informatica INstrumental");
        listaDados.add("Logica de programação");
        listaDados.add("Ingles INstrumental");
        listaDados.add("Logica de Programação");
        listaDados.add("Des Mobile");
        listaDados.add("Teste de Software");
        listaDados.add("Metodologias de Desenvolvimento");
        listaDados.add("Novas tecnologias em BD");
        listaDados.add("Programação para bancos de dados");
        listaDados.add("Infraestrutura de serviços WEB");
        listaDados.add("Programação I");
        listaDados.add("Estrutura de Dados");
        listaDados.add("Teste de Software");
        listaDados.add("Metodologias de Desenvolvimento");



    }

    //Metodo da classe AdapterView.OnItemClickListener
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = (String) adapterView.getItemAtPosition(i);//pega o objeto do item clicado.
        abrirTela(item);
        //Toast.makeText(getApplicationContext(), item,Toast.LENGTH_SHORT).show();
    }


    //metodo para abrir uma noja janela/Activity
    private void abrirTela(String item) {

            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("disp", item);
            startActivity(intent);

    }//abrirTela
}//class