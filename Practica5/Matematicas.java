
package Parcial2.Practica5;

public class Matematicas {
   int a, b;
double r;
    public Matematicas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Matematicas(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
   
    
    
    private void su (){
    r=this.getA()+this.getB();
        this.setR(r);
    }
    public void suma(){
    su();
    }
    
    private void re(){
    r=this.getA()-this.getB();
    this.setR(r);
    }
    public void resta(){
    re();
    }
    private void mu(){
    r=this.getA()*this.getB();
    this.setR(r);
    }
    public void Multiplicacion(){
    mu();
    }
    private void di(){
    r=this.getA()/this.getB();
    this.setR(r);
    }
    public void Division(){
    di();
    }
    
}
