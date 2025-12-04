import java.util.Scanner;
public class edades {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int e1,e2,e3,e4;
        String a,b,c,d;
        System.out.println("Dame el nombre de la persona 1");
        a=leer.next();
        System.out.println("dame la edad de la persona 1");
        e1=leer.nextInt();
        System.out.println("Dame el nombre de la persona 2");
        b=leer.next();
        System.out.println("Dame la edad de la persona 2");
        e2=leer.nextInt();
        System.out.println("Dame el nombre de la persona 3");
        c=leer.next();
         System.out.println("Dame la edad de la persona 3");       
        e3=leer.nextInt();
        System.out.println("dame el nombre de la persona 4");
        d=leer.next();
        System.out.println("Dame la edad de la persona 4");
        e4=leer.nextInt();
        
        int mayor = e1;
        
        if (e2>mayor) {
                mayor=e2;
        }
         if (e3>mayor) {
             
                mayor=e3;
        }
         if (e4>mayor) {
                mayor=e4;
        }       
                
        System.out.println("La pesrona mayor tiene "+mayor+"años");        
       }
}
