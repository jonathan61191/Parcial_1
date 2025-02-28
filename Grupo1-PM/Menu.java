import java.util.Scanner;




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
                    Punto5 objP5 = new Punto5();
                    objP5.P5(dimension);
                    break;
                

                default:
                System.out.println("hasta pronto");
                    continuar = false;
                    break;
            }
        }
    }
}
