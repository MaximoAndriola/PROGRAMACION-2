package Clases;

import java.util.ArrayList;
import java.util.Collections;

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

        for(Material m : catalogo){
            if(m.titulo.equalsIgnoreCase(titulo)){
                catalogo.remove(m);
                mensaje = "El elemento se encontro y se elimino";
            }
        }
        return mensaje;
    }

    public void ordenar(ArrayList<Material> biblioteca){
        Collections.sort(biblioteca);
    }

}
