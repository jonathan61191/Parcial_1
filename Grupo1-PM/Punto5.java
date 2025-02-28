public class Punto5 {

    public void P5(int d) {

        Metodos mt = new Metodos();
        Objeto[][] M = new Objeto[d][d];
        Objeto[][] Mr = new Objeto[d][d];
        Objeto[][] Ms = new Objeto[d][d];
        M = mt.llenarMatriz(d);
        System.out.println("La matriz inicial del");
        mt.mostrarMatriz(M);
        Mr = mt.MatrizResultante3(M, d);
        System.out.println("los productos activos son:");
        mt.mostrarMatriz(Mr);
        mt.sumaCantidadM(Mr,d);


        
    }
    
}
