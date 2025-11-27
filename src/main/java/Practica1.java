
import java.util.Scanner;
public class Practica1 {
    
    public static void main(String[] args) {
     double lados, perimetro, apotema, area;
     Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos lados tiene el pentagono? ");     
     lados = leer.nextDouble(); 
        System.out.println("Escribe el apotema ");
     apotema = leer.nextDouble();
     perimetro= lados*5;
     area=perimetro*apotema/2;
        System.out.println("El perimetro del pentagono es de: " + perimetro);
        System.out.println("El area del pentagono es de:" + area );
     
     
    }





    
}
