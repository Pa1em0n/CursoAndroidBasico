package com.loteria.myapplication;

/**
 * Created by Usuario on 13/06/2017.
 */

public class Pokemon {
    private  String nombre;
    private  String tipo;
    private  int urlImagen;
    private  String urlVideo;
    private  String descripcion;

    public Pokemon(){

    }

    public Pokemon(String nombre, String tipo, int urlImagen, String urlVideo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.urlImagen = urlImagen;
        this.urlVideo = urlVideo;
        this.descripcion = descripcion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUrlImage() {
        return urlImagen;
    }

    public void setUrlImagen(int urlImagen) {
        this.urlImagen = urlImagen;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}
