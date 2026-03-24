
package Unidad2.Practica14;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        String matricula;
    String NombreE;
   String Apellido;
       String Clave;
   String NombreM;
   double calificacion; 
   int o = 0;
   while(o!=3){
   System.out.println("::::::::Menu:::::::::");
        System.out.println("1.-Registrar Estudiante");
        System.out.println("2.-Registrar Materia");
 o = leer.nextInt();

 switch(o){
     case 1 :
         System.out.println("Ingresa Matricula");
         matricula = leer.next();
         System.out.println("Ingresa el nombre del estudainte");
         NombreE = leer.next();
         System.out.println("Ingresa el apellido del estudiante");
         Apellido = leer.next();
         Estudiante e = new Estudiante(matricula, NombreE, Apellido);
System.out.println( e.toString());
         break;
     case 2:
         System.out.println("Ingresa la clave");
         Clave = leer.next();
         System.out.println("Nombre de la materia");
         NombreM=leer.next();
         System.out.println("calificacion");
         calificacion = leer.nextDouble();
         Materia m= new Materia(Clave, NombreM, calificacion);
   
          System.out.println("Ingresa la clave");
         Clave = leer.next();
         System.out.println("Nombre de la materia");
         NombreM=leer.next();
         System.out.println("calificacion");
         calificacion = leer.nextDouble();
         Materia m2= new Materia(Clave, NombreM, calificacion);
        
          System.out.println("Ingresa la clave");
         Clave = leer.next();
         System.out.println("Nombre de la materia");
         NombreM=leer.next();
         System.out.println("calificacion");
         calificacion = leer.nextDouble();
         Materia m3= new Materia(Clave, NombreM, calificacion);
          
         System.out.println("Materia 1 "+m.toString());
          System.out.println("Materia 2 "+m2.toString());
         System.out.println("Materia 3 "+m3.toString());
 }
}
        
          
          
          
          
        
        
        
        
        
    }
    
    
    
}
