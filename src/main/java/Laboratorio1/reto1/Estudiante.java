package Laboratorio1.reto1;

public class Estudiante {

    private String nombre;
    private String semestre;
    private String correo;
    private String edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String semestre, String correo, String edad) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.correo = correo;
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString(){
        return nombre + ", " + " estudiante de " + semestre + "° semestre de " + edad + " años";
    }
}
