package Clases;

import java.util.*;

public class Biblioteca {
    private ArrayList<Material> catalogo;

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

    @Override
    public String toString() {
        return "Biblioteca{" +
                "catalogo=" + catalogo +
                '}';
    }
}
