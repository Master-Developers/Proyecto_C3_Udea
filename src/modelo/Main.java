package modelo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prueba de acceso al repositorio");
        System.out.println("Prueba 2");
        System.out.println("Prueba3");
        System.out.println("Prueba4");

        Empleado empleado1 =  new Empleado("Pedro","pp@gorads.com","Eterprise","Operario");

        MovimientoDeDinero movdinero = new MovimientoDeDinero(empleado1,23423,132.3);
        movdinero.ingresarDinero(empleado1,10.0);

        System.out.println("El empleado "+empleado1.getNombre()+" ahora tiene el saldo de "+movdinero.getSaldo());


    }
}