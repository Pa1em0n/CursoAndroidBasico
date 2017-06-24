package com.loteria.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Usuario on 13/06/2017.
 */

public class AdaptarLista extends BaseAdapter {
    private  Context context;
    private  ArrayList<Pokemon> listaPokemon;

    public AdaptarLista(Context context, ArrayList<Pokemon> listaPokemon){
        this.context = context;
        this.listaPokemon = listaPokemon;
    }

    @Override
    public int getCount() {
        return listaPokemon.size();
    }
;
    @Override
    public Object getItem(int posicion) {
        return listaPokemon.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        Pokemon seleccionado = listaPokemon.get(posicion);

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.adapter_pokemon, null);

        ImageView imagen = (ImageView) v.findViewById(R.id.imagen_pokemon);
        TextView nombre = (TextView) v.findViewById(R.id.nombre_pokemon);
        TextView  tipo = (TextView) v.findViewById(R.id.tipo_pokemon);

        nombre.setText(seleccionado.getNombre());
        tipo.setText(seleccionado.getTipo());
        Glide.with(context).load(seleccionado.getUrlImage()).into(imagen);

        return v;
    }
}
