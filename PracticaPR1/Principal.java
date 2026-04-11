
package Parcial2.PracticaPR1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FaltanVocalesException {
        Scanner leer = new Scanner(System.in);
        String cadena;
        cadena=leer.nextLine();
        int r = 0;
  
        for (int i = 0; i < cadena.length(); i++) {
            char c =  cadena.charAt(i);
              
          switch(c){
              case 'A' -> r = r+1;
                  case 'E' -> r = r+1;
                    case 'I' -> r = r+1;
                    case 'O' -> r = r+1;
                    case 'U' -> r = r+1;
                    case 'a' -> r = r+1;
                    case 'e' -> r = r+1;
                    case 'i' -> r = r+1;
                    case 'o' -> r = r+1;
                    case 'u' -> r = r+1;
                    case 'á' -> r = r+1;
                    case 'é' -> r = r+1;
                    case 'í' -> r = r+1;
                    case 'ó' -> r = r+1;
                    case 'ú' -> r = r+1;
                  
          }         
        }        
            if (r<3) {
                throw new FaltanVocalesException();
            }
           
          
            
            
            
            
              
    }
            
            
            
            
            
        }
        


        
        
        
        
        
        
        

