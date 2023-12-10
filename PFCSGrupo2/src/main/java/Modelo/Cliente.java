package Modelo;


public class Cliente {
    int id;
    String nombre_cliente = "";
    String telefono_cliente = "";
    String correo_cliente = "";
    String fecha_cliente = "";
    String contraseña_cliente = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getFecha_cliente() {
        return fecha_cliente;
    }

    public void setFecha_cliente(String fecha_cliente) {
        this.fecha_cliente = fecha_cliente;
    }

    public String getContraseña_cliente() {
        return contraseña_cliente;
    }

    public void setContraseña_cliente(String contraseña_cliente) {
        this.contraseña_cliente = contraseña_cliente;
    }
    
    public Cliente(String nombre, String telefono, String correo, String fecha, String contraseña) {
        nombre_cliente = nombre;
        telefono_cliente = telefono;
        correo_cliente = correo;
        fecha_cliente = fecha;
        contraseña_cliente = contraseña;
        
        this.id = 0; //Esto será sobreescrito en la BD
    }

    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre_cliente=" + nombre_cliente + ", telefono_cliente=" + telefono_cliente + ", correo_cliente=" + correo_cliente + ", fecha_cliente=" + fecha_cliente + ", contrase\u00f1a_cliente=" + contraseña_cliente + '}';
    }
    
    

    public Cliente() {
        
        
        
    }
    
}
