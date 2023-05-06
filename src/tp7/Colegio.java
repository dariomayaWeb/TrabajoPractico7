
package tp7;

import java.util.ArrayList;
import java.util.HashSet;


public class Colegio {

   
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno(1001,"López","Martín");
        Alumno a2 = new Alumno(1002,"Martínez","Brenda");
        
        Materia m1 = new Materia(1,"Inglés I",1);
        Materia m2 = new Materia(2,"Matemática",1);   
        Materia m3 = new Materia(3,"Laboratorio",1);

        
        System.out.println("El alumno "+a1 );
        HashSet ma1=agregarMaterias(m1);
        HashSet ma2=agregarMaterias(m2);
        HashSet ma3=agregarMaterias(m3);
        int c1=cantidadMaterias(ma3);
        System.out.println("El alumno está inscripto en "+c1);
        
        
        System.out.println("El alumno "+a2 );
        HashSet mat1=agregarMaterias(m1);
        HashSet mat2=agregarMaterias(m2);
        HashSet mat3=agregarMaterias(m3);
        HashSet mat4 =agregarMaterias(m3);
        int c2=cantidadMaterias(mat4);
        System.out.println("El  alumno  está inscripto en "+c2);
    }
     public static HashSet agregarMaterias(Materia m){       
      HashSet <Materia>materias=new HashSet();
            materias.add(m);
  
        System.out.println(" se inscribe en las siguientes materias: "+materias);
   return materias;
    }
    
    public static int cantidadMaterias(HashSet materias){
        int cantidadmat=0;
        for (int i = 0; i < materias.size() ; i++) {
            cantidadmat ++;          
        }
        return cantidadmat;
    }
    public static  ArrayList alumnos(){
      ArrayList alumnos = new ArrayList();
      
      alumnos.add (new Alumno());
        
        return alumnos;
    }
}
    
