package Clases;

import Enumeradores.Genero;
import Enumeradores.TipoComparacion;

import java.util.*;

public class Biblioteca {
    private ArrayList<Material> catalogo;
    TipoComparacion comparador;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarMaterial(Material m){
        catalogo.add(m);
    }

    public String eliminarMaterial(String titulo){
        String mensaje = "El elemento a eliminar no se encontro en la lista";

        for(int i = 0; i < catalogo.size(); i++){
            Material m = catalogo.get(i);
            if(m.titulo.equalsIgnoreCase(titulo)){
                catalogo.remove(m);
                mensaje = "El elemento se encontro y se elimino";
            }
        }
        return mensaje;
    }

    public boolean modificarMaterial(String titulo, Material nuevoM){
        for (int i = 0; i < catalogo.size(); i++){
            Material m = catalogo.get(i);
            if(m.titulo.equals(titulo)){
                catalogo.remove(m);
                catalogo.add(nuevoM);
                return true;
            }
        }
        return false;
    }

    public void ordenarTitulo(Biblioteca biblioteca){
        Collections.sort(biblioteca.catalogo);
    }

    public List<Libro> filtrarLibrosPorGenero(Genero genero){
        List<Libro> librosFiltrados = new ArrayList<>();

        for(Material m : catalogo){
            if (m instanceof Libro l){
                if (l.getGenero().equals(genero)){
                    librosFiltrados.add(l);
                }
            }
        }

        return librosFiltrados;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "catalogo=" + catalogo +
                '}';
    }
}