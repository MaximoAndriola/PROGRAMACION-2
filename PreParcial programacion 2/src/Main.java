import Clases.Biblioteca;
import Clases.Libro;
import Clases.Material;
import Enumeradores.Genero;
import Enumeradores.TipoMaterial;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarMaterial(new Libro("Harry Potter", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 2000));
        biblioteca.agregarMaterial(new Libro("ABC", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 1200));
        biblioteca.agregarMaterial(new Libro("El señor de los anillos", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 1200.4));
        biblioteca.agregarMaterial(new Libro("Borrador", "J.K. Rowlling", "2014", "200", Genero.DRAMA, 200));

        biblioteca.ordenarTitulo(biblioteca);
        System.out.println(biblioteca);

        biblioteca.eliminarMaterial("El señor de los anillos");

        System.out.println(biblioteca);
    }
}