
package tp7;


public class Materia {
    private int idmateria;
    private String nombreMat;
    private int anio;

    public Materia() {
    }
    

    public Materia(int idmateria, String nombreMat, int anio) {
        this.idmateria = idmateria;
        this.nombreMat = nombreMat;
        this.anio = anio;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombre) {
        this.nombreMat = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "{" + "idmateria=" + idmateria + ", nombreMat=" + nombreMat + ", anio=" + anio + '}';
    }
    
    
}
