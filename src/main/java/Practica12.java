
import java.util.Scanner;
public class Practica12 {
    public static void main(String[] args) {
       float precio, peso;
       int zona;
      
       Scanner leer= new Scanner(System.in);
        System.out.println("Peso en gramos");
        peso =leer.nextFloat();
         if (peso>0 && peso<5000){
             System.out.println("Envios");
             System.out.println("1..  America del norte $11.00");
             System.out.println("2.. America Central $10.00");
             System.out.println("3.. America del Sur $12.00");
             System.out.println("4.. Europa $24.00");
             System.out.println("5.. Asia $27.00");
             zona=leer.nextInt();
             
             switch (zona) {
                 case 1:
                     precio =11F;
                     break;
                 case 2:
                     precio=10f;
                 break;
                 case 3:
                     precio =12f;
                     break;
                 case 4:
                     precio =24f;
                     break;
                 case 5:
                     precio=27f;
                     break;
                 default:
                     precio=0;
                     
                 
                 
             }
             System.out.println("Pago $" +(precio*peso));
             
         }else {
                     System.out.println("No podemos hacer el envio");
                     }
    }
}
             
             
             
             
             
         