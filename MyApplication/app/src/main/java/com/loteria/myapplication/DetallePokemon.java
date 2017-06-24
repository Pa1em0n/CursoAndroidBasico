package com.loteria.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetallePokemon extends Activity {

    private TextView  textViewNombre;
    private ImageView imageViewPokemon;
    private TextView  textViewDetalle;
    private String urlVideo;

    String nombre ="";
    String tipo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pokemon);

        textViewNombre = (TextView) findViewById(R.id.nombre_pokemon);
        imageViewPokemon = (ImageView) findViewById(R.id.imagen_pokemon);
        textViewDetalle = (TextView) findViewById(R.id.detalles);
        urlVideo = "";

        //Sacar los valores
        Bundle bd = getIntent().getExtras();

        if (bd != null){
            nombre = (String) bd.get("nombre");
            tipo = (String) bd.get("tipo");
            Integer idImagen = (Integer) bd.get("foto");
            urlVideo = (String) bd.get("urlVideo");

            textViewNombre.setText(nombre);
            textViewDetalle.setText((tipo));
            imageViewPokemon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageViewPokemon.setImageResource(idImagen);






        }
    }

    public void verVideo(View v){

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlVideo));

        startActivity(i);

    }

}
