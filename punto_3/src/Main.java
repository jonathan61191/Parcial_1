public class Main {

    public static void main(String[] args) {
        
        Libro[][] libreria = llenarLibro(3, 3);
        System.out.println("la matriz antes de es:");
        mostrarPrecioMatriz(libreria);
        buscarMayorPrecio(libreria);
        
        

    }

    

    public static Libro[][] llenarLibro(int fila, int columna) {

        Libro[][] libreria = new Libro[fila][columna];
        int x = 1;
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                
                String autor = "Autor"+x;
                String titulo = "Novela_"+j+""+i;
                Float precio = 100.0f / x;
                libreria[i][j] =  new  Libro(titulo,precio,autor);
                x++;
                
            }
            
        }
        
        return libreria;

    }


    public static void buscarMayorPrecio(Libro[][] libreria){

        float precioMayLib = 0;
        String libroMayo = "";

        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria.length; j++) {
                
                if (precioMayLib < libreria[i][j].getPrecio()) {

                    precioMayLib = libreria[i][j].getPrecio();
                    libroMayo = libreria[i][j].getTitulo();
                    

                }
            }
        }
        System.out.println("el titulo del libro con mayor precio es:");
        System.out.println(libroMayo);
        System.out.print("Y su precio es: ");
        System.out.print(precioMayLib);
        System.out.print("$");
            
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


