package Clases;

import java.util.ArrayList;
import java.util.List;

public class ClienteA {
    public int id;
    public String nombre;
    public List<Menu_Baleadas> carrito;

    public ClienteA(String nombre) {
        this.id = (int) (Math.random() * (50000 - 10000 + 1) + 1000);
        this.nombre = nombre;
        this.carrito = new ArrayList<Menu_Baleadas>();
    }

    public void agregar_menu1(Menu_Baleadas p) {
        this.carrito.add(p);
    }

    public void sacar_menu(Menu_Pollo p) {
        this.carrito.remove(p);
    }

    public void delivery() {
        int numero_distintosPED=1;
        int delivery=70;
        int total_delivery;
        total_delivery=delivery * numero_distintosPED;
        System.out.println("Total Delivery:\t\t\t\t\t\t\t\t\t\t\t\t\t  "+total_delivery);
    }

    public void imprimir_carrito () {
        System.out.println("CARRITO DE: \t\t\t" + String.valueOf(this.id) + " +++++ " + this.nombre);
        System.out.println("PEDIDO 1: \t\t\t\t\t\t PRECIO: \t\t\t\t\t\t DELIVERY:");
        for (Menu_Baleadas p : this.carrito) {
            p.imprimir1();
        }

    }
}
