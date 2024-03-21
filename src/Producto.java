package src;

/**
 * @author Victor Pérez
 * @since 21/03/2024
 * Modela un producto de la tienda
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private String categoria;
    private String etiquetas;
    private double precio;
    private String urlFoto;

    /**
     * Constructor de la clase Producto
     * @param nombre Nombre del producto
     * @param descripcion Descripción/contenido del producto
     * @param categoria Categoría a la que pertenece el producto
     * @param etiquetas Etiquetas que describen el producto
     * @param precio Precio del producto
     * @param urlFoto URL de la foto del producto
     */
    public Producto(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
        this.precio = precio;
        this.urlFoto = urlFoto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    /**
     * Imprime la información del producto
     */
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Etiquetas: " + etiquetas);
        System.out.println("Precio: " + precio);
        System.out.println("URL de la foto: " + urlFoto);
    }
}
