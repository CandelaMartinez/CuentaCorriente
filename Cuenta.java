package actividad07.ejercicio01.cuentaCorriente;

/**
 *
 * @author Candela
 */
public class Cuenta {

    //VARIABLES DE CLASE: defino las variables de clase como private asi no se pueden modificar 
    //desde otras clases, solo accedere a ellas con los metodos getter y setter
    public int numeroCuenta;

    public  double saldo;
    public String nombreTitular;

    //CONSTRUCTOR: defino el constructor como public para poder acceder desde otras clases
    //e instanciar objetos de la clase Cuenta
    //this hace referencia a la variable definida en la clase en la que estoy
    //paso por parametro los valores para inicializar las variables de clase
    public Cuenta(double saldo, String nombreTitular, int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    /**
     * *************************************************************************
     */
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

    /**
     * **************************************************************************
     */
    public static void menuCuentas() {
        System.out.println("1- primera cuenta");
        System.out.println("2- segunda cuenta");
        System.out.println("3- tercera cuenta");

    }

    public static int eligeCuenta() {
        menuCuentas();
        int cuenta = Utilidades.pideEntero("numero cuenta: ");
        return cuenta;
    }

    public  void ingreso() {
        double ingreso = Utilidades.pideDouble("dinero que quieres ingresar");
        saldo = saldo + ingreso;
        System.out.println("el nuevo saldo es: "+saldo);

    }

    public  void egreso(){
        double egreso= Utilidades.pideDouble("dinero que quieres egresar: ");
        saldo = saldo - egreso;
         System.out.println("el nuevo saldo es: "+saldo);
    }
    
   public void ingreso2(double importe){
       saldo=saldo + importe;
       System.out.println("el saldo de la cuenta origen es: "+saldo);
   }
       public void egreso2(double importe){
           saldo=saldo-importe;
           System.out.println("el saldo de la cuenta destino es: "+saldo);
       }
        
        
        
    
    
    
}


