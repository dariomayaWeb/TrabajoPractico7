
package tp7;

import java.util.ArrayList;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList <Materia> inscripciones = new ArrayList<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getInscripciones() {
        return inscripciones;
    }

       
    public void agregarMaterias(Materia m){
        inscripciones.add(m);

    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    
}


//    
//    public int cantidadMaterias(){
//        int cantidadmat=0;
//        for (int i = 0; i < materias.size() ; i++) {
//            cantidadmat ++;          
//        }
//        return cantidadmat;
//    }
//}
