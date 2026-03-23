
package Unidad2.Practica13;


public class Cuenta {
    private Titular titular;
    private double saldo;
    
    public Cuenta(Titular titular, double saldo) throws MontosNegativoException{
    this.titular= titular;
//me pueden proporcionar un saldo negativo entonces debo validar que el ingresar lanza una excepcion 
    // this.saldo=saldo;
    ingresar(saldo);
    }
    public Cuenta (Titular titular){
    this.titular=titular;
    this.saldo=0;
    }
    
    public void ingresar(double monto)throws MontosNegativoException{
    if(monto<0){
    throw new MontosNegativoException();
    }else{
    this.saldo=this.saldo+monto;
    }
    
    }
}
