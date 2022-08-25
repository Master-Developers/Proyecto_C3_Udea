package modelo;

public class MovimientoDeDinero implements IMovimientoDinero{

    //Atributos-----------------------------------------------------------------------
    protected Empleado empleado;
    protected double saldo;
    //---------------------------------------------------------------------------------
    //Constructor y sobrecarga de constructor
    public MovimientoDeDinero(Empleado empleado, double saldo) {
        this.empleado = empleado;
        this.saldo = saldo;
    }
    public MovimientoDeDinero(Empleado empleado) {
        this.empleado = empleado;
    }
    //Metodoss------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------
    @Override
    public double ingresarDinero(Empleado empleado, double cantidad) {
        //indicar la cantidad de dinero que desea ingresar
        if (cantidad>0){
            return saldo+=cantidad;
        }else {
            return Double.parseDouble("El dinero ingresado debe ser mayor a cero ");
        }
    }
    @Override
    public double retirarDinero(Empleado empleado, double cantidad) {
        if (cantidad>0){
            return saldo-cantidad;
        }else {
            return Double.parseDouble("El dinero retirado debe ser mayor a cero ");
        }
    }
    //-----------------------------------------------------------------------------------------
    //Getters y setters------------------------------------------------------------------------
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //-----------------------------------------------------------------------------------------------
}
