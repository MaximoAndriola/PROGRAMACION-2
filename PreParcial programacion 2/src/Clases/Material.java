package Clases;

import Enumeradores.TipoMaterial;

public abstract class Material implements Comparable<Material>{
    private int ID = ++Material.cantMateriales;
    protected String titulo;
    protected String autor;
    protected String anio;
    protected TipoMaterial tipo;
    public static int cantMateriales;

    public Material(TipoMaterial tipo, String titulo, String autor, String anio) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public int getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Material o) {
        return this.titulo.compareTo(o.titulo);
    }

}
