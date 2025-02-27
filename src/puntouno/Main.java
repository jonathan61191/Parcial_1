package src;


import java.util.Scanner;
import src.puntouno.Producto;


public class Main {

    public static void main(String[] args) {

        Producto[][] almacen = llenarMatriz(5, 6);
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre que quiera buscar:");
        String nombreBuscar = sc.nextLine();
        sc.close();
        int[] posicionProducto = buscarProducto(nombreBuscar, almacen);
        if ( posicionProducto == null ) {
            System.out.println("no encontro ese producto.");

        }

        else {
            System.out.println("el producto esta en la posicion: "+ posicionProducto[0]+", "+posicionProducto[1]);
        }

        mostrarMatriz(almacen);
        sumaCantidadM(almacen);
        mostrarMatrizCan(almacen);

    }
   
    public static Producto[][] llenarMatriz(int fila, int columna){

        Producto[][] almacen = new Producto[fila][columna];
        int x = 1;
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                
                int cantidad = 50+x;
                String nombre = "Producto"+j+""+i;
                Float precio = 100.0f * x;
                almacen[i][j] =  new  Producto(cantidad,nombre,precio);
                x++;
                
            }
            
        }
        
        return almacen;

    }


    public static int[] buscarProducto(String nombre, Producto[][] almacen) {

        for (int i = 0; i < almacen.length; i++) {

            for (int j = 0; j < almacen[i].length; j++) {

                if (almacen[i][j].getNombre().equalsIgnoreCase(nombre)) {

                    return new int[] {i,j};
                
                }


                
            }
            
        }
        return  null;
    }

    public static void mostrarMatriz(Producto[][] almacen){
        System.out.println("Y los nombres de la matriz son:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < almacen.length; i++) {

            for (int j = 0; j < almacen[i].length; j++) {

                System.out.print(" | ");

                System.out.print(almacen[i][j].getNombre());
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }

    public static void sumaCantidadM (Producto[][] almacen) {

        int suma = 0;
        for (int i = 0; i < almacen.length; i++) {

            for (int j = 0; j < almacen[i].length; j++) {

                suma = suma + almacen[i][j].getCantidad();

                
            }


                
        }
        System.out.println("");
        System.out.println("la suma de las cantidades de productos son:");
        System.out.print(suma);
        System.out.println("");
        System.out.println("");
            
    }

    public static void mostrarMatrizCan(Producto[][] almacen){
        System.out.println("Y la cantidad de productos es:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < almacen.length; i++) {

            for (int j = 0; j < almacen[i].length; j++) {

                System.out.print(" | ");

                System.out.print(almacen[i][j].getCantidad());
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }
}
