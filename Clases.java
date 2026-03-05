
package Parcial2.Practica3;

public class Clases {
public double Farenheit(double C){

    double f ;
    f = (C*1.8)+32;
    return f;
    
}
public double Kelvin (double C){
double k;
        k=C+273.15;
return k;
}
    
    
    
    
    double C ;

    public Clases(double C) {
        this.C = C;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }




    


    
}
