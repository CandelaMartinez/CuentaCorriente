/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad07.ejercicio01.cuentaCorriente;

/**
 *
 * @author Candela
 */
public class TestCuenta {

    public static void main(String[] args) {
        int opcion;
        int cuenta;
        int cuentaOrigen;
        int cuentaDestino;
do{
        Cuenta primeraCuenta = new Cuenta(5000, "Mariano Cabuti", 1);

        Cuenta segundaCuenta = new Cuenta(8000, "Jimena Priore", 2);

        Cuenta terceraCuenta = new Cuenta(2000, "Javier Lopez", 3);

        Cuenta arrayCuentas[] = new Cuenta[3];

        arrayCuentas[0] = primeraCuenta;
        arrayCuentas[1] = segundaCuenta;
        arrayCuentas[2] = terceraCuenta;

        System.out.println("1- CONSULTA DE SALDO");
        System.out.println("2- INGRESO DE DINERO");
        System.out.println("3- RETIRO DE DINERO");
        System.out.println("4- REALIZAR TRANSFERENCIA");
        System.out.println("5- FINALIZAR");

        opcion = Utilidades.pideEntero("elige la operacion que deseas realizar");

        switch (opcion) {
            case 1:
                cuenta = Cuenta.eligeCuenta();
                System.out.println(arrayCuentas[cuenta - 1].getSaldo());

                break;
            case 2:
                cuenta = Cuenta.eligeCuenta();
                arrayCuentas[cuenta - 1].ingreso();

                break;

            case 3:

                cuenta = Cuenta.eligeCuenta();
                arrayCuentas[cuenta - 1].egreso();

                break;

            case 4:
                Cuenta.menuCuentas();
                cuentaOrigen = Utilidades.pideEntero("dime la cuenta de origen");
                Cuenta.menuCuentas();
                cuentaDestino = Utilidades.pideEntero("dime la cuenta destino");
                double dineroTransferir = Utilidades.pideDouble("importe a transferir");

                arrayCuentas[cuentaOrigen - 1].egreso2(dineroTransferir);
                arrayCuentas[cuentaDestino - 1].ingreso2(dineroTransferir);

                break;
                
            case 5:
                System.out.println("Gracias por usar nuestros servicios. Adios.");

                return;
        }

    }while(opcion!=5);
}

}
