import java.util.Arrays;
import java.util.Comparator;

public class Main{

    public static void main(String[] args) {

        Asiento[][] teatro = llenarTeatro(4, 4);
        System.out.println("la matriz antes de es:");
        mostrarPrecioMatriz(teatro);

        ordenarFila(teatro);

        System.out.println("la matriz despues de ordenarla es:");
        mostrarPrecioMatriz(teatro);

        
    }

    public static Asiento[][] llenarTeatro(int f, int columna) {

        Asiento[][] teatro = new Asiento[f][columna];
        int x = 1;
        for (int i = 0; i < f; i++) {

            for (int j = 0; j < columna; j++) {
                
                int fila = i;
                int numero = j+i;
                Float precio = 100000.0f /x;
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
        System.out.println("teatro");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < teatro.length; i++) {

            for (int j = 0; j < teatro[i].length; j++) {

                System.out.print(" | ");

                System.out.print(teatro[i][j].getPrecio());
                System.out.print(" - ");
                System.out.print(teatro[i][j].getFila());
                System.out.print(" - ");
                System.out.print(teatro[i][j].getNumero());
                
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }

}