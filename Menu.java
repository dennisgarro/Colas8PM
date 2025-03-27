import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Queue cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        String mensaje = "Bienvenido al FastFoot perros llaneros y algomas! \n"
                + "Por favor Seleccione nuestro menú \n"
                + "1 : Perro Caliente \n"
                + "2 : Hamburguesa \n"
                + "3 : Perra \n"
                + "4 : Salchipapas \n"
                + "5 : no quiero Nada";

        while (bandera) {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida por favor intente de nuevo.....");
                sc.next();
            }
            opt = sc.nextInt(); // al tener el scanner dentro del validador me lo pedia 2 veces y saltaba al
                                // while principal asi fuera valido
            while (opt > 5 || opt < 1) {
                System.out.println();
                System.out.println("Pagina en mantenimiento por favor escoja una opcion valida");
                System.out.println(mensaje);
                while (!sc.hasNextInt()) {
                    System.out.println("Opcion no valida por favor intente de nuevo.....");
                    sc.next();
                }
                opt = sc.nextInt();
            }
            switch (opt) {
                case 1:

                    bandera = false;
                    break;
                case 2:
                    bandera = false;
                    break;
                case 3:
                    bandera = false;
                    break;
                case 4:
                    bandera = false;
                    break;
                case 5:
                    System.out.println("no compraste nada duro de paris");
                    bandera = false;
                    break;

                default:
                    break;
            }
        }
    }
}
