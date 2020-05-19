/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotproven;

/**
 *
 * @author marcomorando
 */
public class Cancion {

    private String clave;
    private String interprete;
    private String autor;
    private String album;
    private int duracion;

    public Cancion(String cl) {
        this.clave = cl;
    }

    public Cancion(String clave, String interprete, String autor, String album, int duracion) {
        this.clave = clave;
        this.interprete = interprete;
        this.autor = autor;
        this.album = album;
        this.duracion = duracion;
    }
    public Cancion(String clave, String interprete,String album){
        this.clave = clave;
        this.interprete = interprete;
        this.album = album;
    }

    //SETTERS y GETTERS
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setDuración(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean equalsclau(String c) {
        return this.clave.equals(c);
    }

    @Override
    public String toString() {
        return this.clave + " int: " + this.interprete + " autor: " + this.autor + " album: " + this.album + " " + this.duracion + " min.";
    }
}
