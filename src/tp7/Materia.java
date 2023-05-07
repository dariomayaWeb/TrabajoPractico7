
package tp7;

public class Materia {
    private int idMateria;
    private String nombreMat;
    private int anio;

    public Materia(int idMateria, String nombreMat, int anio) {
        this.idMateria = idMateria;
        this.nombreMat = nombreMat;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return this.getNombreMat();
    }
    
}