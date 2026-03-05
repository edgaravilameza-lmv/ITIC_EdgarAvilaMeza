
package Parcial2.Practica3;

import java.util.Scanner;


public class Calculadora {
 
    public static void main(String[] args) {
 Scanner leer= new Scanner(System.in);
 double t;
      t = leer.nextDouble();
      Clases C = new Clases(t);
 int o=0;
while(o!=4){
        System.out.println("::::::::::MENU CALCULADORA::::::::::");
        System.out.println("1.- Alta Temperatura en °Centigrados");
                System.out.println("2.- Conversión de °Centigrados a °Farenheit");
                System.out.println("3.- Conversión de °Centigrados a °Kelvin");
                System.out.println("4.-Salir");
 o = leer.nextInt();
Clases cal = new Clases(o);
switch(o){
    case 1:
          System.out.println(t);
          break;
    case 2:
       t= cal.Farenheit(t);
      break;
    case 3:
        t= cal.Farenheit(t);
  break;
    case 4:
        System.out.println(":::Saliendo:::");
        break; 
}
    System.out.println(t);
    }
    }
}
