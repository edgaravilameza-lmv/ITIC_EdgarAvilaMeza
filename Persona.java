
package Unidad2.Practica2;



public class Persona {
  //atributos ->privados->Principio de encapsulamiento
        
        int id;
        private String nombre; 
        private String apellidoP;
        private String apellidoM;
        private String edad;
  
    //metodos
        //SET Y GET 
    //nacen para llevar informacion a cada atribto y para obtener la informacion 
        //que este en cada atributo tambien
/*el constructor sirve para cuando recien inicializamos los atributos en una misma linea para no usar tanto set */
        /*¿para que sirve el set ? lo vamos a usar mas para editar la informacion */
    public Persona() {
        this.id = 3;
        this.nombre = "Messi";
        this.apellidoP = "asdasd";
        this.apellidoM = "asdad";
        this.edad = "324";
    }

    public Persona(int id, String nombre, String apellidoP, String apellidoM, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", edad=" + edad + '}';
    }
        
        
        
}
