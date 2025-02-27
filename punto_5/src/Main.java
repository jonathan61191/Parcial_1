package src;

import src.puntocinco.Inventario;
import src.puntocinco.Tienda;

public class Main {

    public static void main(String[] args){
        

        Inventario inventario1 = new Inventario();
        Inventario inventario2 = new Inventario();
        Tienda[][] tienda_uno = inventario1.llenarTiendaUno(3, 3);
        Tienda[][] tienda_Dos = inventario2.llenarTiendaDos(3, 3);

        inventario1.mostrarTiendaUno(tienda_uno);
        inventario2.mostrarTiendaDos(tienda_Dos);

    }





}
