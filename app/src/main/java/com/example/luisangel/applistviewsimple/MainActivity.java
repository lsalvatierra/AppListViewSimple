package com.example.luisangel.applistviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvCiudades;
    String[] vCiudades = new String[]
            {"Canta", "Cusco", "Piura","Huancayo", "Lima", "Trujillo","Ica", "Callao", "Puno","Trujillo", "Arequipa", "Iquitos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCiudades= (ListView)findViewById(R.id.lista);

        lvCiudades.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,vCiudades));

        lvCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "Posicion"+String.valueOf(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Valor:"+vCiudades[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
