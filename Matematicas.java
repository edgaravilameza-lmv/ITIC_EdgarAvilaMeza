
package Parcial2.Practica1;

   

public class Matematicas {
public void calcularFactorial(int numero ) {
    int f =1 ;
    for (int i = 1; i <= numero; i++) {
        f=f*i;
    }
    System.out.println("total factorial= "+f);
}   
public String esPar (int numero){
int N=numero;
if (N%2==0){
    return "Es par";
}else {
    return "Es impar";
}  
}
public int sumaDigitos (String numero){
    String N= numero ;
    int A=0, B=1;    
    int K=0;
    for (int i = 0; i < N.length(); i++) {
              String D= N.substring(A, B);
              A=A+1;
              B=B+1;
             
           int d = Integer.parseInt(D);
              K = K+d;
    }
    return K;
    
}
public String esPrimo (int n){
    
    if (n<=1) {
      return "no es primo";  
    }
    for (int i = 2; i < n; i++) {
        if (n%i==0) {
            return "no es primo";
        }
    }
    
            return "es primo";
}
public String invertirNumero (String n ){
    int a=n.length()-1, b=n.length();
    String CF="";
    for (int i = 0; i < n.length(); i++) {
        String subcadena = n.substring(a, b);
        CF= CF+subcadena;
        a=a-1;
        b=b-1;
    }
    return CF;
}
public double Promedio (double n, double b,double a){
    double r=0;
    r=(n+b+a)/3;
    
    return r;
}}




  
            
  
    
    





