package src;

import java.util.Scanner;
import src.puntoseis.Punto6;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dimension = 0;
        System.out.println("Ingrese la dimension de la matriz");
        while (!sc.hasNextInt()) {
            System.out.println("la dimension debe ser un numero entero");
            sc.next();
        }
        dimension = sc.nextInt();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la opcion que desea realizar");
            while (!sc.hasNextInt()) {
                System.out.println("la dimension debe ser un numero entero");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Punto6 objP6 = new Punto6();
                    objP6.P6(dimension);
                    break;
                

                default:
                System.out.println("hasta pronto");
                    continuar = false;
                    break;
            }
        }
    }
}
