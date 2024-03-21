package src;

/**
 * @author Victor Pérez
 * @since 21/03/2024
 * Clase principal donde se desarrolla el programa
 */
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Leche Entera Alpina", "Bolsa x 1.100 ml", "Lácteo/Huevos y refrigerados", "Leches", 3100, "urlFoto1.jpg");
        Producto producto2 = new Producto("Leche Alpina Deslactosada", "Bolsa x 1.100 ml", "Lácteo/Huevos y refrigerados", "Leches", 3400, "urlFoto2.jpg");
        Producto producto3 = new Producto("Leche Alpina Semi-Descremada", "Bolsa x 1.100 ml", "Lácteo/Huevos y refrigerados", "Leches", 3500, "urlFoto3.jpg");
        Producto producto4 = new Producto("Leche Alpina Descremada", "Bolsa x 1.100 ml", "Lácteo/Huevos y refrigerados", "Leches", 3500, "urlFoto4.jpg");
        Producto producto5 = new Producto("Leche Alpina Entera", "Bolsa x 1.100 ml", "Lácteo/Huevos y refrigerados", "Leches", 3100, "urlFoto5.jpg");

        System.out.println("--- Producto 1 ---");
        producto1.mostrarDetalles();
        System.out.println("");

        System.out.println("--- Producto 2 ---");
        producto2.mostrarDetalles();
        System.out.println("");

        System.out.println("--- Producto 3 ---");
        producto3.mostrarDetalles();
        System.out.println("");

        System.out.println("--- Producto 4 ---");
        producto4.mostrarDetalles();
        System.out.println("");

        System.out.println("--- Producto 5 ---");
        producto5.mostrarDetalles();
    }
}