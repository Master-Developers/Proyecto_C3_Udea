package modelo;

public class Empleado {

        private String Nombre;
        private String Correo;
        private String Empresa;
        private String rol;

<<<<<<< HEAD
=======
    public Empleado(String nombre, String correo, String empresa, String rol) {
        Nombre = nombre;
        Correo = correo;
        Empresa = empresa;
        this.rol = rol;
    }

>>>>>>> 07d1017 (Se prueban los metodos de la clase MovimientoDinero)
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
}
