import java.util.Scanner;

public class Aplicacion {
    static void main() {
        Scanner sc= new Scanner(System.in);

        Empresa empresa= new Empresa("ModaStyle", "123", "Carrera 14");

        Inventario inventario1= new Inventario("579", 10);
        Inventario inventario2= new Inventario("124", 10);
        Inventario inventario3= new Inventario("457", 10);

        Sucursal sucursal1= new Sucursal("Mundo telas", "456", "Calle 48", "Armenia", inventario1);
        Sucursal sucursal2= new Sucursal("Tierra santa", "789", "Carrera 19", "Bogotá", inventario2);
        Sucursal sucursal3= new Sucursal("Mundo moda", "135", "Calle 50", "Medellín", inventario3);

        Prenda prenda1= new Prenda("CM001","Camisa deportiva", "Nike", 65000,"Negro",50,Talla.L,CategoriaPrenda.CAMISETA);
        Prenda prenda11= new Prenda("CM002","Camisa polo", "Stars", 70000,"Azul rey",50,Talla.XL,CategoriaPrenda.CAMISETA);
        Prenda prenda2= new Prenda("PL001","Pantalon deportiva", "Nike", 65000,"Negro",50,Talla.XS,CategoriaPrenda.PANTALON);
        Prenda prenda22= new Prenda("PL002","Jean Straight", "Arturo calle", 100000,"Gris",50,Talla.M,CategoriaPrenda.PANTALON);
        Prenda prenda3= new Prenda("VS001","Vestido de gala", "Glamour", 150000,"Blanco",50,Talla.L,CategoriaPrenda.VESTIDO);
        Prenda prenda33= new Prenda("VS002","Vestido camisero", "Chevignon", 140000,"Verde",50,Talla.S,CategoriaPrenda.VESTIDO);
        Prenda prenda4= new Prenda("CH001","Chaqueta deportiva", "Adidas", 60000,"Rojo",50,Talla.L,CategoriaPrenda.CHAQUETA);
        Prenda prenda44= new Prenda("CH002","Chaqueta de cuero", "ZARA", 80000,"Negro",50,Talla.XS,CategoriaPrenda.CHAQUETA);
        Prenda prenda5= new Prenda("CL001","tenis deportivos", "Adidas", 90000,"Blanco",50,Talla.T36,CategoriaPrenda.CALZADO);
        Prenda prenda55= new Prenda("CL002","Converse", "Reebok", 170000,"Negro",50,Talla.T40,CategoriaPrenda.CALZADO);


    }
}
