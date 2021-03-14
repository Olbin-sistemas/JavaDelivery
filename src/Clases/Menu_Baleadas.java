package Clases;

public class Menu_Baleadas {
    public String descripcion;
    public double precio;
    public String Delivery;
    public String categoria;

    public Menu_Baleadas(String _descripcion, double _precio,String _Delivery) {
        descripcion = _descripcion;
        precio = _precio;
        Delivery=_Delivery;
    }

    public void imprimir1() {
        System.out.println(this.descripcion + " \t\t\t\t " + String.valueOf(this.precio));
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void Super_Baleadas(String categoria){

    }



}
