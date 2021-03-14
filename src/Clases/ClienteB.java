package Clases;

import java.util.ArrayList;
import java.util.List;

public class ClienteB {

    public int id;
    public String nombre;
    public List<Menu_Pollo> carrito;
    public List<Menu_Dennis> carrito2;


    public ClienteB(String nombre) {
        this.id = (int) (Math.random() * (50000 - 10000 + 1) + 1000);
        this.nombre = nombre;
        this.carrito = new ArrayList<Menu_Pollo>();
        this.carrito2 = new ArrayList<Menu_Dennis>();
    }


    public void agregar_menu1(Menu_Pollo p) {
        this.carrito.add(p);
    }

    public void sacar_menu(Menu_Pollo p) {
        this.carrito.remove(p);
    }

    public void agregar_menu2(Menu_Dennis p1) {
        this.carrito2.add(p1);
    }
    public void quitar_menu2(Menu_Dennis p1) {
        this.carrito2.remove(p1);
    }

    public void delivery() {
        int numero_distintosPED=2;
        int delivery=70;
        int total_delivery;
        total_delivery=delivery * numero_distintosPED;
            System.out.println("Total Delivery:\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+total_delivery);
        }

        public void imprimir_carrito () {
            System.out.println("CARRITO DE: \t\t\t" + String.valueOf(this.id) + " +++++ " + this.nombre);
            System.out.println("PEDIDO 1: \t\t\t\t\t\t PRECIO: \t\t\t\t\t\t DELIVERY:");
            for (Menu_Pollo p : this.carrito) {
                p.imprimir();
            }
            System.out.println("\n");
        }

        public void imprimir_carrito2 () {
            System.out.println("PEDIDO 2: \t\t\t\t\t\t PRECIO:");
            for (Menu_Dennis p1 : this.carrito2) {
                p1.imprimir2();
            }
        }
    }
