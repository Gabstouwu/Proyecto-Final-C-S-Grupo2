package Modelo;

public class Empleado {

    int id;
    String identificacion;
    String nombreEmpleado;
    String edad;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado(String identificacion, String nombreEmpleado, String edad, String password) {
        this.identificacion = identificacion;
        this.nombreEmpleado = nombreEmpleado;
        this.edad = edad;
        this.password = password;
        this.id = 0;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", identificacion=" + identificacion + ", nombreEmpleado=" + nombreEmpleado + ", edad=" + edad + ", password=" + password + '}';
    }


}
