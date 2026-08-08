package Laboratorio1.Reto1;

public class Estudiante {

    private String name;
    private String semester;
    private String email;
    private String age;

    public Estudiante(String name, String semester, String email, String age) {
        this.name = name;
        this.semester = semester;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return name + ", " + " estudiante de " + semester + " semestre de " + age + " años";
    }
}
