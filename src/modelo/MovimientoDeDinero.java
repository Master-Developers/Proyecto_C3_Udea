package modelo;

public class MovimientoDeDinero {

    // Atributos-----------------------------------------------------------------------
    protected Empleado empleado;
    protected double montoInicial;

    // ---------------------------------------------------------------------------------
    // Constructor y sobrecarga de constructor
    public MovimientoDeDinero(Empleado empleado, double montoInicial) {
        this.empleado = empleado;
        this.montoInicial = montoInicial;
    }
    public MovimientoDeDinero(Empleado empleado) {
        this.empleado = empleado;
    }

    // Metodoss------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------
    public double ingresarDinero(Empleado empleado, double monto) {
        // indicar la cantidad de dinero que desea ingresar
        if (monto > 0) {
            return montoInicial += monto;
        } else {
            return Double.parseDouble("El dinero ingresado debe ser mayor a cero ");
        }
    }
    public double retirarDinero(Empleado empleado, double monto) {
        if (monto > 0) {
            return montoInicial -= monto;
        } else {
            return Double.parseDouble("El dinero retirado debe ser mayor a cero ");
        }
    }
    // -----------------------------------------------------------------------------------------
    // Getters y
    // setters------------------------------------------------------------------------
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }
    // -----------------------------------------------------------------------------------------------
}