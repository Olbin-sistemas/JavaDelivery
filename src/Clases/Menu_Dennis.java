package Clases;

public class Menu_Dennis {
    public String descripcion;
    public double precio;
    public String Delivery;
    public String categoria;

    public Menu_Dennis(String _descripcion, double _precio,String _Delivery){
        descripcion=_descripcion;
        precio=_precio;
        Delivery=_Delivery;
    }
    public void imprimir2() {
        System.out.println(this.descripcion + " \t\t\t\t " + String.valueOf(this.precio) + " \t\t\t\t\t\t\t\t " + this.Delivery);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void Dennis(String categoria){


    }
}