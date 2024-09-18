package Clases;

import Enumeradores.Estado;
import Enumeradores.Genero;
import Enumeradores.TipoMaterial;
import Interfaces.I_Prestable;

public class Libro extends Material implements I_Prestable {
    protected String cantPaginas;
    protected Genero genero;
    protected Estado estado;

    public Libro(String titulo, String autor, String anio, String cantPaginas, Genero genero) {
        super(TipoMaterial.LIBRO, titulo, autor, anio);
        this.cantPaginas = cantPaginas;
        this.genero = genero;
        this.estado = Estado.DISPONIBLE;
    }

    @Override
    public void prestar() {
        if(estado.equals(Estado.DISPONIBLE)){
            estado = Estado.PRESTADO;
        }
    }

    @Override
    public void devolver() {
        if(estado.equals(Estado.PRESTADO)){
            estado = Estado.DISPONIBLE;
        }
    }
}
