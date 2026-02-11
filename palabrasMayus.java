
package S1;

import java.util.Scanner;

public class palabrasMayus {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cadenaTexto, textoFinal = "";
        String palabra, palabraMin="";
        cadenaTexto=leer.nextLine();
        
        String vector[] = cadenaTexto.split(" ");
     
        for (int i=0; i < vector.length; i++){
            
        if(i>0){
            
            palabra= vector[i].toUpperCase();
           
          textoFinal= textoFinal+ palabra+" ";
        }else{ 
           palabraMin=vector[i];
        }
   
        }
       textoFinal=palabraMin +" " + textoFinal;
      textoFinal = textoFinal.trim();
       System.out.println(textoFinal); 
        
    }
    
}
