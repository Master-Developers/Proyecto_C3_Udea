package modelo;

public class Empleado {
    // Atributos
    private String Nombre;
    private int Cedula;
    private int Numero_Celular;
    private String Correo;
    private String Empresa;
    private String rol; // Administratico operativo

    // Constructor

    public Empleado(String nombre, int cedula, int numero_Celular, String correo, String empresa) {
        Nombre = nombre;
        Cedula = cedula;
        Numero_Celular = numero_Celular;
        Correo = correo;
        Empresa = empresa;

    }

    public Empleado(String rol) {
        this.rol = rol;
    }

    // Getter y Setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public int getNumero_Celular() {
        return Numero_Celular;
    }

    public void setNumero_Celular(int numero_Celular) {
        Numero_Celular = numero_Celular;
    }

}
