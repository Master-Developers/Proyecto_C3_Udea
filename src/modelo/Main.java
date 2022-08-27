package modelo;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Prueba de acceso al repositorio");
        System.out.println("Prueba 2");
        System.out.println("Prueba3");
        System.out.println("Prueba4");

        Empleado empleado1 = new Empleado("Pedro", 109273645, 320873635, "pedro1234@gmail.com", "Operario");
        Empleado empleado2 = new Empleado("Daniela", 109283645, 324873635, "daniela1234@gmail.com", "Operario");
        Empleado empleado3 = new Empleado("Camilo", 1092745, 320773635, "camilo1234@gmail.com", "Operario");
        Empleado empleado4 = new Empleado("Oscar", 1273645, 320573635, "oscar1234@gmail.com", "Operario");
        Empleado empleado5 = new Empleado("Alberto", 1093645, 320073635, "albertp1234@gmail.com", "Operario");

        // Imprmir la informacion
        System.out.println(empleado1.getNombre() + " " + empleado1.getCedula() + " " + empleado1.getCorreo()
                + " " + empleado1.getEmpresa() + " " + empleado1.getRol());
        System.out.println(empleado2.getNombre() + " " + empleado2.getCedula() + " " + empleado2.getCorreo()
                + " " + empleado2.getEmpresa() + " " + empleado2.getRol());
        System.out.println(empleado3.getNombre() + " " + empleado3.getCedula() + " " + empleado3.getCorreo()
                + " " + empleado3.getEmpresa() + " " + empleado3.getRol());
        System.out.println(empleado4.getNombre() + " " + empleado4.getCedula() + " " + empleado4.getCorreo()
                + " " + empleado4.getEmpresa() + " " + empleado4.getRol());
        System.out.println(empleado5.getNombre() + " " + empleado5.getCedula() + " " + empleado5.getCorreo()
                + " " + empleado5.getEmpresa() + " " + empleado5.getRol());

        MovimientoDeDinero movdinero1 = new MovimientoDeDinero(empleado1, 150000);
        MovimientoDeDinero movdinero2 = new MovimientoDeDinero(empleado2, 20000);
        MovimientoDeDinero movdinero3 = new MovimientoDeDinero(empleado3, 30000);
        MovimientoDeDinero movdinero4 = new MovimientoDeDinero(empleado4, 10000);
        MovimientoDeDinero movdinero5 = new MovimientoDeDinero(empleado5, 5000);

        // Pruebas de movimiento de dinero

        movdinero1.ingresarDinero(empleado1, 978067);
        movdinero2.ingresarDinero(empleado2, 2000000);
        movdinero3.ingresarDinero(empleado3, 1000000);
        movdinero4.ingresarDinero(empleado4, 568900);
        movdinero5.ingresarDinero(empleado5, 3000000);

        System.out
                .println("El empleado " + empleado1.getNombre() + " ahora tiene el saldo de " + movdinero1.getSaldo());
        System.out
                .println("El empleado " + empleado2.getNombre() + " ahora tiene el saldo de " + movdinero2.getSaldo());
        System.out
                .println("El empleado " + empleado3.getNombre() + " ahora tiene el saldo de " + movdinero3.getSaldo());
        System.out
                .println("El empleado " + empleado4.getNombre() + " ahora tiene el saldo de " + movdinero4.getSaldo());
        System.out
                .println("El empleado " + empleado5.getNombre() + " ahora tiene el saldo de " + movdinero5.getSaldo());

        movdinero1.retirarDinero(empleado1, 140000);
        movdinero2.retirarDinero(empleado2, 300000);
        movdinero3.retirarDinero(empleado3, 200000);
        movdinero4.retirarDinero(empleado4, 500000);
        movdinero5.retirarDinero(empleado5, 700000);

        System.out.println("El empleado1 ahora tiene " + movdinero1.getSaldo());
        System.out.println("El empleado2 ahora tiene " + movdinero2.getSaldo());
        System.out.println("El empleado3 ahora tiene " + movdinero3.getSaldo());
        System.out.println("El empleado4 ahora tiene " + movdinero4.getSaldo());
        System.out.println("El empleado5 ahora tiene " + movdinero5.getSaldo());

    }
}