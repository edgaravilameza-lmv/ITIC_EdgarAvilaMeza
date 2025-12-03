import java.util.Scanner;
public class intentoedades {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int e1,e2,e3,e4;
        String n1,n2,n3,n4;
        System.out.println("Escribe el nombre de la persona 1");
        n1=leer.next();
        System.out.println("Escribe la edad de la persona 1");
        e1=leer.nextInt();
        System.out.println("Escribe el nombre de la persona 2");
        n2=leer.next();
        System.out.println("Escribe la edad de la persona 2");
        e2=leer.nextInt();
        System.out.println("Escribe el nombre de la persona 3");
        n3=leer.next();
        System.out.println("Escribe la edad de la persona 3");
        e3=leer.nextInt();
        System.out.println("Escribe el nombre de la edad de la persona 4");
        n4=leer.next();
        System.out.println("Escribe la edad de la persona 4");
        e4=leer.nextInt();
        if(e1>e2){
            if(e1>e3){
                if(e1>e4){
                    System.out.println("La edad mayor es la 1 de "+e1);
                }else{
                    if (e1==e4){
                        System.out.println("son iguales");
                    }else{
                        System.out.println("e4 es mayor");
                    }}
            }else{
            if(e1==e2){
                System.out.println("son iguales");
            }else{
                if(e2>e3){
                    if(e2>e4){
                        System.out.println("La edad mayor es la 2 de"+n2);
                    
            }else{
                    if(e2==e4){
                        System.out.println("son iguales");
                    }else{
                        System.out.println("La edad mayor es la 4 de"+n4);
                    }}
                    }else{
                    if(e2==e3){
                        System.out.println("son iguales");
                    }else{
                        System.out.println("e3 es mayor");
                    }
                    
                    
                    
                    }
                
            
            
            
            
            
        }
    }
}
