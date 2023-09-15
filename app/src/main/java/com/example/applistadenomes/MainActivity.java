package com.example.applistadenomes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView ListaNomes;
    private String [] itens= {
            "Hugo Chaves",
            "Aline Alves",
            "Pietra Mendes",
            "Paulo César",
            "Marcela Meneses"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaNomes = findViewById(R.id.ListNomes);
        ArrayAdapter <String> adapter;
        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens

        );
        ListaNomes.setAdapter(adapter);

        ListaNomes.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick (AdapterView<?> adapterView, View view, int i, long l) {
                        String nomeSelecionado = ListaNomes.getItemAtPosition(i).toString();
                        Toast.makeText(getApplicationContext(), nomeSelecionado, Toast.LENGTH_SHORT).show();


                    } // onItemClick

                } // OnItemClick Listener

        );


    } // fim create
}
