package Clases;

import Enumeradores.TipoMaterial;
import Interfaces.I_Digital;

public class Ebook extends Material implements I_Digital {
    //PDF, WORD, etc
    protected String formato;

    public Ebook(String titulo, String autor, String anio, String formato) {
        super(TipoMaterial.EBOOK, titulo, autor, anio);
        this.formato = formato;
    }

    @Override
    public void narrarTexto() {

    }

    @Override
    public void narrarParrafo() {

    }

    @Override
    public void cambiarFormato() {

    }

    @Override
    public void descargar() {

    }

    @Override
    public void leer() {

    }
}
