package modelo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prueba de acceso al repositorio");
        System.out.println("Prueba 2");
        System.out.println("Prueba3");
        System.out.println("Prueba4");

        Empleado empleado1 =  new Empleado("Pedro",109273645,320873635,"pedro1234@gmail.com","Operario");
        Empleado empleado2 =  new Empleado("Daniela",,109283645,324873635,"daniela1234@gmail.com","Operario");
        Empleado empleado3 =  new Empleado("Camilo",,1092745,320773635,"camilo1234@gmail.com","Operario");
        Empleado empleado4 =  new Empleado("Oscar",,1273645,320573635,"oscar1234@gmail.com","Operario");
        Empleado empleado5 =  new Empleado("Alberto",,1093645,320073635,"albertp1234@gmail.com","Operario");

        MovimientoDeDinero movdinero = new MovimientoDeDinero(empleado1,123.41);


        //Pruebas de movimiento de dinero

        movdinero.ingresarDinero(empleado1,978067);
        movdinero.ingresarDinero(empleado2,2000000);
        movdinero.ingresarDinero(empleado3,1000000);
        movdinero.ingresarDinero(empleado4,568900);
        movdinero.ingresarDinero(empleado5,3000000);

        System.out.println("El empleado "+empleado1.getNombre()+" ahora tiene el saldo de "+movdinero.getSaldo());
        System.out.println("El empleado "+empleado2.getNombre()+" ahora tiene el saldo de "+movdinero.getSaldo());
        System.out.println("El empleado "+empleado3.getNombre()+" ahora tiene el saldo de "+movdinero.getSaldo());
        System.out.println("El empleado "+empleado4.getNombre()+" ahora tiene el saldo de "+movdinero.getSaldo());
        System.out.println("El empleado "+empleado5.getNombre()+" ahora tiene el saldo de "+movdinero.getSaldo());

        movdinero.retirarDinero(empleado1,140000);
        movdinero.retirarDinero(empleado1,300000);
        movdinero.retirarDinero(empleado1,200000);
        movdinero.retirarDinero(empleado1,500000);
        movdinero.retirarDinero(empleado1,700000);

        System.out.println( "El empleado ahora tiene "+movdinero.getSaldo());


    }
}