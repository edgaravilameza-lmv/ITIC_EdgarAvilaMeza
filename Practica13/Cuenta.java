
package Parcial2.Practica13;

public class Cuenta {
    private Titular titular;
    private double saldo;

    public Cuenta(Titular titular, double saldo)throws SaldoNegativoException {
        this.titular = titular;
        this.ingresar(saldo);
    }

    public Cuenta(Titular titular) {
        this.titular = titular;
        this.saldo=0;
    }
    
    public void ingresar(double Monto)throws SaldoNegativoException{
        if (Monto < 0) {
            throw new SaldoNegativoException();
        }else {
        this.saldo = this.saldo+Monto;
        
        }
    }
    
    public void Retirar(double monto)throws SaldoNegativoException{
        if (monto < 0) {
            throw new SaldoNegativoException();
        }
        if (monto  > this.saldo) {
            this.saldo=0;       
        }else{
        this.saldo=this.saldo-monto;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
    
    
}
