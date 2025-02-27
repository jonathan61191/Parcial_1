package src.puntoseis;

public class Punto6 {

    public void P6(int d) {

        Metodos mt = new Metodos();
        Objeto[][] M = new Objeto[d][d];
        Objeto[][] Mr = new Objeto[d][d];
        //M = mt.llenarMatriz(d);
        //mt.mostrarMatriz(M);

        M[0][0] = new Objeto(true, "a",  0.1f);
        M[0][1] = new Objeto(true, "b",  0.1f);
        M[1][0] = new Objeto(true, "c",  0.1f);
        M[1][1] = new Objeto(true, "d", 0.1f);
        Mr = mt.MatrizResultante3(M, d);
        //mt.mostrarMatriz(Mr);

        
    }
    
    
}