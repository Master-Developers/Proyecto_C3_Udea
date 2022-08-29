package modelo;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Pruebas manuales de la clase Empresa
        Empresa empresa1= new Empresa("Enterprise","Cll 15 #12-32",321890131,1234);
        Empresa empresa2=new Empresa("atlas","cll 5B #32-15",312341513,5432);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("-------------Pruebas manuales de la clase Empresa-----------------------");
        System.out.println("La empresa "+empresa1.getNombreEmpresa()+"Se ha trasladado de de direccion: "
                +empresa1.getDireccionEmpresa());
        empresa1.setDireccionEmpresa("Cll 26 #12A-43");
        System.out.println("La nueva dirección es: "+empresa1.getDireccionEmpresa());


        //Pruebas manuales de la clase empleado
        Empleado empleado1 = new Empleado("Pedro", 109273645, 320873635, "pedro1234@gmail.com", empresa1,Rol.OPERARIO);
        Empleado empleado2 = new Empleado("Daniela", 109283645, 324873635, "daniela1234@gmail.com", empresa1,Rol.ADMINISTRADOR);
        Empleado empleado3 = new Empleado("Camilo", 1092745, 320773635, "camilo1234@gmail.com", empresa1,Rol.OPERARIO);
        Empleado empleado4 = new Empleado("Oscar", 1273645, 320573635, "oscar1234@gmail.com", empresa2,Rol.ADMINISTRADOR);
        Empleado empleado5 = new Empleado("Alberto", 1093645, 320073635, "albertp1234@gmail.com", empresa2,Rol.OPERARIO);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("-------------Pruebas manuales de la clase Empleado-----------------------");
        // Imprmir la informacion
        System.out.println(empleado1.getNombre() + " " + empleado1.getCedula() + " " + empleado1.getCorreo()
                + " " + empleado1.getEmpresa().getNombreEmpresa() + " " + empleado1.getRol());
        System.out.println(empleado2.getNombre() + " " + empleado2.getCedula() + " " + empleado2.getCorreo()
                + " " + empleado2.getEmpresa().getNombreEmpresa() + " " + empleado2.getRol());
        System.out.println(empleado3.getNombre() + " " + empleado3.getCedula() + " " + empleado3.getCorreo()
                + " " + empleado3.getEmpresa().getNombreEmpresa() + " " + empleado3.getRol());
        System.out.println(empleado4.getNombre() + " " + empleado4.getCedula() + " " + empleado4.getCorreo()
                + " " + empleado4.getEmpresa().getNombreEmpresa() + " " + empleado4.getRol());
        System.out.println(empleado5.getNombre() + " " + empleado5.getCedula() + " " + empleado5.getCorreo()
                + " " + empleado5.getEmpresa().getNombreEmpresa() + " " + empleado5.getRol());

        System.out.println("------------------------------------------------------------------------");
        System.out.println("-------------Pruebas manuales de la clase MovimientoDinero-----------------------");

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
                .println("El empleado " + empleado1.getNombre() + " ha cobrado su sueldo y ahora tiene el saldo de " + movdinero1.getMontoInicial()+"$");
        System.out
                .println("El empleado " + empleado2.getNombre() + " ha cobrado su sueldo y ahora tiene el saldo de " + movdinero2.getMontoInicial()+"$");
        System.out
                .println("El empleado " + empleado3.getNombre() + " ha cobrado su sueldo y ahora tiene el saldo de " + movdinero3.getMontoInicial()+"$");
        System.out
                .println("El empleado " + empleado4.getNombre() + " ha cobrado su sueldo y ahora tiene el saldo de " + movdinero4.getMontoInicial()+"$");
        System.out
                .println("El empleado " + empleado5.getNombre() + " ha cobrado su sueldo y ahora tiene el saldo de " + movdinero5.getMontoInicial()+"$");

        movdinero1.retirarDinero(empleado1, 1400000);
        movdinero2.retirarDinero(empleado2, 3000000);
        movdinero3.retirarDinero(empleado3, 200000);
        movdinero4.retirarDinero(empleado4, 500000);
        movdinero5.retirarDinero(empleado5, 700000);

        System.out.println("El empleado "+ empleado1.getNombre()+" ha pagado facturas y ahora tiene " + movdinero1.getMontoInicial()+"$");
        System.out.println("El empleado "+ empleado2.getNombre()+" ha pagado facturas y ahora tiene " + movdinero2.getMontoInicial()+"$");
        System.out.println("El empleado "+ empleado3.getNombre()+" ha pagado facturas y ahora tiene " + movdinero3.getMontoInicial()+"$");
        System.out.println("El empleado "+empleado4.getNombre() + " ha pagado facturas y ahora tiene " + movdinero4.getMontoInicial()+"$");
        System.out.println("El empleado "+ empleado5.getNombre()+ " ha pagado facturas y ahora tiene " + movdinero5.getMontoInicial()+"$");
    }
}