package Modelo;

public class Admin {

    String nombre_Usuario;
    String contraseña;

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Admin(String nombre, String contraseñaAdmin) {

        nombre_Usuario = nombre;
        contraseña = contraseñaAdmin;

    }

    @Override
    public String toString() {
        return "admin{" + "nombre_Usuario=" + nombre_Usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
