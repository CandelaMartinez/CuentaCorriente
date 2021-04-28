package actividad07.ejercicio01.cuentaCorriente;

/**
 *
 * @author Candela
 */
public class TestCuenta {

    private static Cuenta[] arrayCuentas;

    public static void main(String[] args) {
        int opcion;
        int cuenta;
        int cuentaOrigen;
        int cuentaDestino;
        arrayCuentas = new Cuenta[3];
        arrayCuentas[0] = new Cuenta(5000, "Mariano Cabuti", 1);
        arrayCuentas[1] = new Cuenta(2000, "Javier Lopez", 3);
        arrayCuentas[2] = new Cuenta(2000, "Javier Lopez", 3);

        do {
            do {
                System.out.println("----------------------------------------------------");
                System.out.println("1- CONSULTA DE SALDO");
                System.out.println("2- INGRESO DE DINERO");
                System.out.println("3- RETIRO DE DINERO");
                System.out.println("4- REALIZAR TRANSFERENCIA");
                System.out.println("5- FINALIZAR");

                opcion = Utilidades.pideEntero("Elige la operacion que deseas realizar");

                if (opcion < 0 || opcion > 5) {
                    System.out.println("************************************************************");
                    System.out.println("OPCION INVALIDA! debes elegir entre las opciones que te di!");
                }

            } while (opcion < 0 || opcion > 5);

            switch (opcion) {
                case 1:
                    cuenta = Cuenta.eligeCuenta();
                    System.out.println("----------------------------------------------------");
                    System.out.println("El saldo de la cuenta perteneciente a: "+arrayCuentas[cuenta -1].getTitular()+" es: "+arrayCuentas[cuenta - 1].getSaldo()+" euros");

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
                    cuentaOrigen = Utilidades.pideEntero("Cuenta de origen");
                    Cuenta.menuCuentas();
                    cuentaDestino = Utilidades.pideEntero("Cuenta destino");
                    double dineroTransferir = Utilidades.pideDouble("Importe a transferir");

                    arrayCuentas[cuentaOrigen - 1].egreso2(dineroTransferir);
                    arrayCuentas[cuentaDestino - 1].ingreso2(dineroTransferir);

                    break;

                case 5:
                    System.out.println("************************************************************");
                    System.out.println("Gracias por usar nuestros servicios. Adios.");
                    System.out.println("************************************************************");

                    return;
            }

        } while (opcion != 5);
    }

}
