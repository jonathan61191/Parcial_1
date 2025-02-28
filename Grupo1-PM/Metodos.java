import java.util.Scanner;

public class Metodos {
    
    Scanner sc = new Scanner(System.in);

    public Objeto[][] llenarMatriz(int dimension){

        Objeto[][] m = new Objeto[dimension][dimension];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                Objeto obj= new Objeto("", "",   1.2f, false );
                System.out.println("Ingrese el nombre del producto");
                obj.setNombre(sc.next());
                System.out.println("Ingrese la descripcion del producto");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                obj.setPrecio(sc.nextFloat());
                System.out.println("ingrese 1 si esta disponible y 0 sino esta disponible");
                if (sc.next().toLowerCase().equals("1")){

                    obj.setDisponibilidad(true);
                }else {
                    obj.setDisponibilidad(false);

                }

                
                
                m[i][j] = obj;

                
            }
        }

        return m;
    }

    public void sumaCantidadM (Objeto[][] m, int dimension) {

        
        int suma = 0;
        int suma1 = 0;
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                Objeto obj = m[i][j];

                if(obj != null){

                    suma = 1;
                    suma1 = suma1 + suma;
                }
                
            }


                
        }
        System.out.println("la suma de las cantidades de productos son:"+suma1);
        

        
        
            
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
        //mostrarMatriz(mr);
        return mr;
    }

    public void mostrarMatriz(Objeto[][] m){
        
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


