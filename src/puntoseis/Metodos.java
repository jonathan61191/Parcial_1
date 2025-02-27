package src.puntoseis;
import java.util.Scanner;

public class Metodos {
    
    Scanner sc = new Scanner(System.in);

    public Objeto[][] llenarMatriz(int dimension){

        Objeto[][] m = new Objeto[dimension][dimension];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                Objeto obj= new Objeto(false, "a", 1.2f);
                                System.out.println("Ingrese el nombre del producto");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                obj.setPrecio(sc.nextFloat());
                System.out.println("ingrese Y si esta disponible y N sino esta disponible");
                if (sc.next().toLowerCase().equals("y")){
                    obj.setDisponibilidad(true);
                }
                else {
                    obj.setDisponibilidad(false);
                }

                
                
                m[i][j] = obj;

                
            }
        }

        return m;
    }

    public Objeto[][] MatrizResultante(Objeto[][] m,  int dimension){

        Objeto[][] mr = new Objeto[dimension][dimension];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j].isDisponibilidad()) {
                    //Objeto obj2= new Objeto(false, "a", 1.2f);
                    mr[i][j] = m[i][j];
                    //m[i][j].getPrecio();
                    //m[i][j].isDisponibilidad();
                    }



                // for (int j2 = 0; j2 < mr.length; j2++) {
                //     for (int k = 0; k < mr.length; k++) {

                //         if (m[i][j].isDisponibilidad()) {
                //         Objeto obj2= new Objeto(false, "a", 1.2f);
                //         m[i][j].getNombre();
                //         m[i][j].getPrecio();
                //         m[i][j].isDisponibilidad();

                //         mr[j2][k] = obj2;
                //         }
                //     }
                // }

                
            }
        }

        return mr;    
    }

    public Objeto[][] MatrizResultante2(Objeto[][] m,  int dimension){

        Objeto[][] mr = new Objeto[dimension][dimension];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                if (m[i][j].isDisponibilidad()) {
                    int bandera = 0;
                    
                for (int j2 = 0; j2 < mr.length; j2++) {
                    if (bandera == 1){
                        break;
                    }
                    for (int k = 0; k < mr.length; k++) {
                        if (bandera == 1){
                            break;
                        }
                        Objeto o = null;
                        if (mr[j2][k] == null){ 
                            o = m[i][j];
                        } 
                        if (o == null) {
                        
                            bandera = 2;
                        
                            break;
                        
                        }
                        else {
                            mr[j2][k] = o;
                            bandera = 1;
                            break;
                        }
                    }
                
                }

                
                }
            }

            
        }
        return mr;
    }

    public Objeto[][] MatrizResultante3(Objeto[][] m,  int dimension){

        Objeto[][] mr = new Objeto[dimension][dimension];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].isDisponibilidad() == true) {

                    int bandera = 0;
                    for (int i2 = 0; i2 < mr.length; i2++) {
                        if(bandera == 1){
                            break;
                        }
                        for (int j2 = 0; j2 < mr.length; j2++) {
                            Objeto obj = mr[i2][j2];

                            if(obj == null){
                                obj = m[i][j];
                                mr[i2][j2] = obj;
                                bandera = 1;
                                
                                break;
                            }
                        }
                    
                    }

                
                }
            }

            
        }
        mostrarMatriz(mr);
        return mr;
    }

    public void mostrarMatriz(Objeto[][] m){
        System.out.println("Y los nombres de la matriz son:");
        System.out.print("----------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                System.out.print(" | ");
                if (m[i][j] == null){
                    System.out.println
                    (" ");
                }
                else {
                System.out.print(m[i][j].getNombre());
                System.out.print("-");
                System.out.print(m[i][j].getPrecio());
                System.out.print("-");
                System.out.print(m[i][j].isDisponibilidad());
                }
            }
            
            System.out.print(" | ");
            System.out.println("");
            System.out.print("----------------------------------------------------------------------------------");
            System.out.println("");

                
        }
            
    }
}
