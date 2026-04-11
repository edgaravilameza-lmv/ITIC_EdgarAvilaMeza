
package Parcial2.Practica14;

public class Materia {
  String Clave;
   String NombreM;
   double calificacion;

    public Materia(String Clave, String NombreM, double calificacion) {
        this.Clave = Clave;
        this.NombreM = NombreM;
        this.calificacion = calificacion;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombreM() {
        return NombreM;
    }

    public void setNombreM(String NombreM) {
        this.NombreM = NombreM;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Materia " + "Clave=" + Clave + ", NombreM=" + NombreM + ", Calificacion=" + calificacion + '}';
    }
    
     
}
