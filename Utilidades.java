
package actividad07.ejercicio01.cuentaCorriente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Candela
 */
public class Utilidades {
       public static int pideEntero(String pregunta){
        int valorEntero=0;
        boolean esEntero=false;
       
        do{
        try{
        System.out.println(pregunta);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String texto=br.readLine();
        valorEntero=Integer.parseInt(texto);
        esEntero=true;
        }catch(NumberFormatException e){
             System.out.println("solo acepto valores numericos enteros");
             esEntero=false;
        }catch(IOException e2){
             System.out.println("error del tipo entrada");
        }catch(Exception e3){
            System.out.println("este error: " + e3.getMessage());
        }
        }while(esEntero==false);
        
        
        return valorEntero;
    }
       
        public static double pideDouble(String pregunta){
        double valorDouble=0;
        boolean esDouble=false;
        do{
        try{
        System.out.println(pregunta);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String texto=br.readLine();
        valorDouble=Double.parseDouble(texto);
        esDouble=true;
        }catch(NumberFormatException e){
            System.out.println("solo acepto valores numericos decimales");
        }catch(IOException e1){
            System.out.println("error del tipo entrada");
        }catch(Exception e2){
             System.out.println("este error: " + e2.getMessage());
        }
        }while(esDouble==false);
        
        
        return valorDouble;
    }
    
}
