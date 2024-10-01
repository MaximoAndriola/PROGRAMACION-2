//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Almacenamiento<Number> numeros = new Almacenamiento<>();

        numeros.agregar(2);
        numeros.agregar(5);
        numeros.agregar(7);
        numeros.agregar(1);
        System.out.println(numeros);
        System.out.println(numeros.eliminar(2));
        System.out.println(numeros.buscar(5));
        */

        Pila<Number> numeros = new Pila<>();
        numeros.agregar(5);
        numeros.agregar(1);
        System.out.println(numeros);
        System.out.println(numeros.cantidad());
    }

}