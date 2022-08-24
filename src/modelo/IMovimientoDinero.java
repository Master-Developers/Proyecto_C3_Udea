package modelo;

public interface IMovimientoDinero {
    //Metodoss------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------
    public double ingresarDinero(Empleado empleado, double cantidad);
    public double retirarDinero(Empleado empleado,double cantidad);
    //public double transferirDinero(Empleado empleado, double cantidad);


}
