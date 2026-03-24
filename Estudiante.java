
package Unidad2.Practica14;

public class Estudiante {
String matricula;
    String NombreE;
   String Apellido;
   


    public Estudiante(String matricula, String NombreE, String Apellido) {
        this.matricula = matricula;
        this.NombreE = NombreE;
        this.Apellido = Apellido;
        
    }

   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "matricula=" + matricula + ", NombreE=" + NombreE + ", Apellido=" + Apellido + '}';
    }

  
    
    
    
    
}
