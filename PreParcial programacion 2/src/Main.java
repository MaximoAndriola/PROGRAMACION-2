import Clases.Biblioteca;
import Clases.Libro;
import Clases.Material;
import Enumeradores.CaseSwitch;
import Enumeradores.Genero;
import Enumeradores.TipoMaterial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Enumeradores.CaseSwitch.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.ordenarTitulo(biblioteca);

        CaseSwitch control = FILTRAR;

        switch (control){
            case AGREGAR:
                biblioteca.agregarMaterial(new Libro("Harry Potter", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 2000));
                biblioteca.agregarMaterial(new Libro("Yo Robot", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 1200));
                biblioteca.agregarMaterial(new Libro("El señor de los anillos", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 1200.4));
                biblioteca.agregarMaterial(new Libro("Iron Man", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 200));
                break;
            case QUITAR:
                biblioteca.eliminarMaterial("El señor de los anillos");
                break;
            case MODIFICAR:
                Material m = new Libro("Mundo Gaturro", "YO", "1999", "5000", Genero.TERROR, 5000);

                biblioteca.modificarMaterial("Yo Robot", m);
                break;
            case ORDENAR:
                biblioteca.ordenarTitulo(biblioteca);
                break;
            case MOSTRAR:
                System.out.println(biblioteca);
                break;
            case PRESTAR:
                break;
            case DEVOLVER:
                break;
            case FILTRAR:
                List<Libro> l = new ArrayList<>();
                l = biblioteca.filtrarLibrosPorGenero(Genero.DRAMA);
                System.out.println(l);
                break;
        }
    }
}