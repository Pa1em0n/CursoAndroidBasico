package com.loteria.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {
    private ListView list;
    private ArrayList<Pokemon> listaPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        list = (ListView) findViewById(R.id.lista);

        Pokemon squirtle = new Pokemon("Squirtle", "Agua",R.drawable.squitle, "https://www.youtube.com/watch?v=Ux9i1OQ4Xy0", "pokemon de agua");
        Pokemon charmander = new Pokemon("Charmander", "Fuego",R.drawable.charmander, "https://www.youtube.com/watch?v=Ux9i1OQ4Xy0", "pokemon de  fuego");
        Pokemon  picachu = new Pokemon("Pikachu", "Agua",R.drawable.pikachu, "https://www.youtube.com/watch?v=Ux9i1OQ4Xy0", "pokemon electrico");
        Pokemon gyarados = new Pokemon("Gyarados", "Agua",R.drawable.gyarados, "https://www.youtube.com/watch?v=Ux9i1OQ4Xy0", "pokemon de agua");

        listaPokemon = new ArrayList<>();
        listaPokemon.add(squirtle);
        listaPokemon.add(charmander);
        listaPokemon.add(picachu);
        listaPokemon.add(gyarados);

        final AdaptarLista adapter = new AdaptarLista(this, listaPokemon);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                Pokemon seleccionado = listaPokemon.get(posicion);
                //Toast.makeText(ListaActivity.this, seleccionado.getNombre(), Toast.LENGTH_LONG).show();
                //Snackbar.make(view, seleccionado.getNombre(), Snackbar.LENGTH_SHORT).show();
                /*Snackbar snackbar = Snackbar.make(view, seleccionado.getNombre(), Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.colorAccent));
                snackbar.show();
*/
                Intent intent = new Intent(getApplicationContext(), DetallePokemon.class);
                intent.putExtra("foto", seleccionado.getUrlImage());
                intent.putExtra("nombre", seleccionado.getNombre());
                intent.putExtra("tipo", seleccionado.getDescripcion());
                intent.putExtra("urlVideo", seleccionado.getUrlVideo());
                startActivity(intent);


            }
        });
    }


}
