import java.util.Arrays;
import java.util.Comparator;

public class Teatro {


    public static Asiento[][] llenarTeatro(int f, int columna) {

        Asiento[][] teatro = new Asiento[f][columna];
        int x = 1;
        for (int i = 0; i < f; i++) {

            for (int j = 0; j < columna; j++) {
                
                int fila = i;
                int numero = j+i;
                Float precio = (100000.0f * x)/i;
                teatro[i][j] =  new  Asiento(numero,fila,precio);
                x++;
                
            }
            
        }
        
        return teatro;

    }

    public static void ordenarFila(Asiento[][] teatro){

        for (int i = 0; i < teatro.length; i++) {
            
            Arrays.sort(teatro[i], Comparator.comparingDouble(a -> a.getPrecio()));
        }




    }

    public static void mostrarPrecioMatriz(Asiento[][] teatro){
        System.out.println("Y los Precios de la matriz son:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < teatro.length; i++) {

            for (int j = 0; j < teatro[i].length; j++) {

                System.out.print(" | ");

                System.out.print(teatro[i][j].getPrecio());
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }
}
