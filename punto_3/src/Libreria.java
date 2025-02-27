import java.util.Scanner;


public class Libreria {

    Scanner sc = new Scanner(System.in);

    public static Libro[][] llenarLibro(int fila, int columna) {

        Libro[][] libreria = new Libro[fila][columna];
        int x = 1;
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                
                String autor = "Autor"+x;
                String titulo = "Novela codigo: "+j+""+i;
                Float precio = 100.0f * x;
                libreria[i][j] =  new  Libro(titulo,precio,autor);
                x++;
                
            }
            
        }
        
        return libreria;

    }


    public static void buscarMayorPrecio(Libro[][] libreria){

        float precioMayLib = 0;
        
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria.length; j++) {
                
                if (precioMayLib < libreria[i][j].getPrecio()) {

                    precioMayLib = libreria[i][j].getPrecio();
                    

                }
            }
        }

        System.out.println(precioMayLib);

    }

    public static void mostrarPrecioMatriz(Libro[][] libreria){
        System.out.println("Y los Precios de la matriz son:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < libreria.length; i++) {

            for (int j = 0; j < libreria[i].length; j++) {

                System.out.print(" | ");

                System.out.print(libreria[i][j].getPrecio());
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }



    
}
