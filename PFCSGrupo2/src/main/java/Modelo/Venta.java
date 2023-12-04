package Modelo;

public class Venta {

    int id;
    String id_empleado = "";
    String id_cliente = "";
    String id_producto = "";

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

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public Venta(int id, String empleado, String cliente, String producto) {
        id_empleado = empleado;
        id_cliente = cliente;
        id_producto = producto;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", id_empleado=" + id_empleado + ", id_cliente=" + id_cliente + ", id_producto=" + id_producto + '}';
    }

}
