package Modelo;

public class Venta {

    int id;
    String id_empleado;
    String id_cliente;
    String id_Producto;
    int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_producto() {
        return cantidad;
    }

    public void setId_producto(int id_producto) {
        this.cantidad = id_producto;
    }

    public String getProducto() {
        return id_Producto;
    }

    public void setProducto(String producto) {
        this.id_Producto = producto;
    }

    public Venta(String empleado, String cliente, int cantidad, String id_Producto) {
        id_empleado = empleado;
        id_cliente = cliente;
        this.id_Producto = id_Producto;
        this.cantidad = cantidad;
        this.id = 0; //Esto será sobreescrito en la BD
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", id_empleado=" + id_empleado + ", id_cliente=" + id_cliente + ", producto=" + id_Producto + ", cantidad=" + cantidad + '}';
    }

}
