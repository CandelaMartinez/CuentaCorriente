package actividad07.ejercicio01.cuentaCorriente;

/**
 *
 * @author Candela
 */
public class Cuenta {

    //VARIABLES DE CLASE: defino las variables de clase como private asi no se pueden modificar 
    //desde otras clases, solo accedere a ellas con los metodos getter y setter
    // numeroCuenta es final asi no se puede modificar, es fijo para cada objeto
    private final int numeroCuenta;
    private double saldo;
    private String nombreTitular;

    //CONSTRUCTOR: defino el constructor como public para poder acceder desde otras clases
    //e instanciar objetos de la clase Cuenta
    //this hace referencia a la variable definida en la clase en la que estoy
    //paso por parametro los valores para inicializar las variables de clase
    public Cuenta(double saldo, String nombreTitular, int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    // **************************************************************************
    //Getters y Setters
    public String getTitular() {
        return nombreTitular;
    }

    public void setTitular(String titular) {
        nombreTitular = titular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;

    }

    //***************************************************************************
    //funcion que imprime el menu de opciones de cuentas
    public static void menuCuentas() {
        System.out.println("1- primera cuenta");
        System.out.println("2- segunda cuenta");
        System.out.println("3- tercera cuenta");

    }

    //funcion que llama a la funcion pideEntero
    public static int eligeCuenta() {
        int cuenta;
        menuCuentas();
        do {
            System.out.println("----------------------------------------------------");
            cuenta = Utilidades.pideEntero("Numero cuenta: ");

            if (cuenta < 1 || cuenta > 3) {
                System.out.println("************************************************************");
                System.out.println("OPCION INVALIDA! debes elegir entre las opciones que te di!");
            }
        } while (cuenta < 1 || cuenta > 3);
        return cuenta;
    }

    public void ingreso() {
        System.out.println("----------------------------------------------------");
        double ingreso = Utilidades.pideDouble("Cuanto dinero que quieres ingresar");
        saldo = saldo + ingreso;
<<<<<<< HEAD
        setSaldo(saldo);

        System.out.println("************************************************************");
        System.out.println("El nuevo saldo es: " + saldo+ " euros.");
=======
//         falto algo así: cuenta.setSaldo(saldo);
        System.out.println("el nuevo saldo es: "+saldo);
>>>>>>> d32c4a7044cc80cfdbbd9a6c65bb0b86696455ca

    }

    public void egreso() {
        double debe;
        System.out.println("----------------------------------------------------");
        double egreso = Utilidades.pideDouble("dinero que quieres egresar: ");
        saldo = saldo - egreso;
        setSaldo(saldo);
        System.out.println("************************************************************");
        System.out.println("el nuevo saldo es: " + saldo+ " euros.");
        if (saldo<0){
            debe= saldo*-1;
            System.out.println("Ha retirado mas dinero del que tenia en la cuenta. Usted le debe al banco:"+ debe+ " euros.");
        }
        
    }

    public void ingreso2(double importe) {
        saldo = saldo + importe;
        setSaldo(saldo);
        System.out.println("************************************************************");
        System.out.println("El saldo de la cuenta destino es: " + saldo+ " euros.");
    }

    public void egreso2(double importe) {
        double debe;
        saldo = saldo - importe;
        setSaldo(saldo);
        System.out.println("************************************************************");
        System.out.println("El saldo de la cuenta de origen es: " + saldo+ " euros.");
         if (saldo<0){
            debe= saldo*-1;
            System.out.println("Ha retirado mas dinero del que tenia en la cuenta. Usted le debe al banco:"+ debe+ " euros.");
        }
    }

}
