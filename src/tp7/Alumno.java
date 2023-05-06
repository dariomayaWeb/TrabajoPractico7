
package tp7;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno() {
    }
   

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

    @Override
    public String toString() {
        return "(" + "legajo:" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ")"  ;
    }
    
}   
    
//    public void agregarMaterias(Materia m){       
//      
//            materias.add(m);
//  
//        System.out.println(" se inscribe en las siguientes materias: "+materias);
//   
//    }
//    
//    public int cantidadMaterias(){
//        int cantidadmat=0;
//        for (int i = 0; i < materias.size() ; i++) {
//            cantidadmat ++;          
//        }
//        return cantidadmat;
//    }
//}
