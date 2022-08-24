package modelo;

public class MovimientoDeDinero {

    //Atributos-----------------------------------------------------------------------
    protected String nombre;
    protected int documento;
    protected double ingresos;
    protected double egresos;
    protected double saldo;

    //---------------------------------------------------------------------------------
    public MovimientoDeDinero(String nombre, int documento, double ingresos, double egresos, double saldo) {
        this.nombre = nombre;
        this.documento = documento;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.saldo = saldo;
    }

    public MovimientoDeDinero(int documento, double ingresos) {
        this.documento = documento;
        this.ingresos = ingresos;
    }
    //Metodoss------------------------------------------------------------------------------
    public void ingresarDinero(double valor){

    }

    public void retirarDinero(double valor){

    }
    public void transferirDinero(double valor){

    }
    //-----------------------------------------------------------------------------------------
    //Getters y setters----------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //
}
