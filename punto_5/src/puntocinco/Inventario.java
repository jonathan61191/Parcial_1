package src.puntocinco;

public class Inventario {

    public Tienda[][] llenarTiendaUno(int fila, int columna) {

        Tienda[][] tienda_uno = new Tienda[fila][columna];
        int x = 1;
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                
                String nombre = "producto"+x;
                int stock = x+j+i;
                Float precio = 100.0f * x;
                tienda_uno[i][j] =  new  Tienda(nombre,precio,stock);
                x++;
                
            }
            
        }
        
        return tienda_uno;

    }

    public void mostrarTiendaUno(Tienda[][] tienda_uno){
        System.out.println("Tienda Uno:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < tienda_uno.length; i++) {

            for (int j = 0; j < tienda_uno[i].length; j++) {

                System.out.print(" | ");

                System.out.print(tienda_uno[i][j].getNombre());
                System.out.print(" - ");
                System.out.print(tienda_uno[i][j].getPrecio());
                System.out.print(" - ");
                System.out.print(tienda_uno[i][j].getStock());
                
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }

    public void mostrarTiendaDos(Tienda[][] tienda_Dos){
        System.out.println("Tienda Dos:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < tienda_Dos.length; i++) {

            for (int j = 0; j < tienda_Dos[i].length; j++) {

                System.out.print(" | ");

                System.out.print(tienda_Dos[i][j].getNombre());
                System.out.print(" - ");
                System.out.print(tienda_Dos[i][j].getPrecio());
                System.out.print(" - ");
                System.out.print(tienda_Dos[i][j].getStock());
                
                
                
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }


    public Tienda[][] llenarTiendaDos(int fila, int columna) {

        Tienda[][] tienda_Dos = new Tienda[fila][columna];
        int x = 3;
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                
                String nombre = "producto"+x;
                int stock = x+j+i;
                Float precio = 556.0f * x;
                tienda_Dos[i][j] =  new  Tienda(nombre,precio,stock);
                x++;
                
            }
            
        }
        
        return tienda_Dos;

    }
    
}
