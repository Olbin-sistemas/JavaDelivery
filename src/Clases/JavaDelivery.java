package Clases;

public class JavaDelivery {
    public static void main(String[] args) {

        ClienteA c2=new ClienteA("JOSE TRNIDAD");
        ClienteB c1 = new ClienteB("JOAN SEBASTIAN");



        Menu_Pollo P1=new Menu_Pollo("POLLO CON TAJADAS",120,"70");
        Menu_Pollo P2=new Menu_Pollo("POLLO CON PAPAS",160,"--");
        Menu_Pollo P3=new Menu_Pollo("POLLO    ENTERO",250,"--");

        Menu_Baleadas A1=new Menu_Baleadas("COMBO 2 BALEADAS ",60,"70");
        Menu_Baleadas A2=new Menu_Baleadas("COMBO 4 BALEADAS",80,"--");
        Menu_Baleadas A3=new Menu_Baleadas("COMBO 8 BALEADAS",120,"--");

        Menu_Dennis B1=new Menu_Dennis("BEYON BURGER\t" ,90,"70");
        Menu_Dennis B2=new Menu_Dennis("GRAND SLAND\t\t"  ,120,"--");
        Menu_Dennis B3=new Menu_Dennis("FRENCH TOAS\t\t"  ,200,"--");

        Menu_DD C1=new Menu_DD("TREAT 1",125,"70");
        Menu_DD C2=new Menu_DD("TREAT 2",200,"--");
        Menu_DD C3=new Menu_DD("TREAT 3",350,"--");

        P1.setCategoria("COMIDA RAPIDA");
        A1.setCategoria("COMIDA RAPIDA");
        B1.setCategoria("COMIDA RAPIDA");
        C1.setCategoria("COMIDA RAPIDA");

        System.out.println("\t\t\t\t\t\t\t\t ClIENTE A");
        c2.agregar_menu1(A1);
        c2.agregar_menu1(A2);
        c2.agregar_menu1(A3);

        c2.imprimir_carrito();
        c2.delivery();

        System.out.println("CATEGORIA: \t\t\t\t\t\t\t\t\t\t"+ A1.getCategoria());
        System.out.println();



        System.out.println("\t\t\t\t\t\t\t\t CLIENTE B");

        c1.agregar_menu1(P1);
        c1.agregar_menu1(P2);
        c1.agregar_menu1(P3);




        c1.agregar_menu2(B1);
        c1.agregar_menu2(B2);
        c1.agregar_menu2(B3);

        c1.imprimir_carrito();
        c1.imprimir_carrito2();
        c1.delivery();


        System.out.println("CATEGORIA: \t\t\t\t\t\t\t\t\t\t"+ P1.getCategoria());


    }

}
