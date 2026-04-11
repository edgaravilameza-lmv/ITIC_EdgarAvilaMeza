
package Parcial2.Practica13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws SaldoNegativoException {
        Scanner leer = new Scanner(System.in);
        double s;
      try{
    Cuenta c1 = new Cuenta (new Titular("Edgar","Avila", "Meza", "19"),2000);
    Cuenta c2 = new Cuenta (new Titular("Edgar","Avila", "Meza", "19"),1000);
    System.out.println("Saldo Para la cuenta 3");
          s= leer.nextInt();
          Cuenta c3 = new Cuenta (new Titular("Edgar","Avila", "Meza", "19"),s);  
            } catch (InputMismatchException e){
            System.out.println("No se aceptan letras en el double");
            }catch(SaldoNegativoException e){
           System.out.println(e.getMessage());

              
            }
    
    }
    
}
