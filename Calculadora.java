
package Parcial2.Practica5;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
int a, b;
System.out.println("Dame dos numeros");       
a=leer.nextInt();
b=leer.nextInt();
Matematicas mat = new Matematicas(a,b);

 int o=0;
    while(o!=5){
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Divicion");
        System.out.println("4.-Multiplicacion");
        System.out.println("5.-Salir");
    o=leer.nextInt();
        switch(o){
        case 1:
            mat.suma();
            System.out.println(mat.getR());     
    break;
        case 2:
            mat.resta();
            System.out.println(mat.getR());
    break;
        case 3:
            mat.Division();
            System.out.println(mat.getR());
        break;
        
        case 4:
            mat.Multiplicacion();
            System.out.println(mat.getR());
            break;
        case 5:
            System.out.println("::::::Saliendo::::::");
            break;
        }
    
    
    }
    }
    
}
