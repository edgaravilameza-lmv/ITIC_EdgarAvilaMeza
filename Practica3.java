//charAt
package Unidad1;

import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String texto = "Hoy es dia de sentencia";
      char letra = texto.charAt(2);
        //StringIndexOutOfBoundsException Es un error de que esta fuera de rango
        System.out.println(letra);
        //convertir a mayusculas las dos ultimas letras
        char penultima = texto.charAt(21);
        char ultima = texto.charAt(22);
       char penultMayus = Character.toUpperCase(penultima);
       char ultiMayus = Character.toUpperCase(ultima);
        System.out.println(penultima+ "->" +penultMayus);
        System.out.println(ultima + "-> " +ultiMayus);
        
        /*length()->tamaño
 sirve para medir una cadena
*/
  String texto2 = "inscripciones";
  int tamaño= texto2.length();
  System.out.println(texto2 + "tiene un tamaño de "+ tamaño);
        
    }
    
}
