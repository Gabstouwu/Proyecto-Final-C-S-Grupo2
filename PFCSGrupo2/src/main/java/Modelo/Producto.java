package Modelo;

public class Producto {

    int id;
    String nombreProducto = "";
    int cantidad = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(String nombre_Producto, int cantidadEnBodega) {

        this.id = 0;
        nombreProducto = nombre_Producto;
        cantidad = cantidadEnBodega;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + '}';
    }

}
