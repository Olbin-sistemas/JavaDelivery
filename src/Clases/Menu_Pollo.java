package Clases;

public class Menu_Pollo {
    public String descripcion;
    public double precio;
    public String Delivery;
    public String categoria;



    public Menu_Pollo(String _descripcion, double _precio,String _Delivery){
        descripcion=_descripcion;
        precio=_precio;
        Delivery=_Delivery;
    }
    public void imprimir(){
        System.out.println(this.descripcion+" \t\t\t\t " + String.valueOf(this.precio)+" \t\t\t\t\t\t\t\t "+this.Delivery );
    }
    public void Pollo_Campero(String categoria){

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
