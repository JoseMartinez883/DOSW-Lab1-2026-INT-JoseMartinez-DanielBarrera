package Laboratorio1.reto1;

import java.util.List;

public class Main {


    public static void main(){

        List<Estudiante> estudiantes = List.of(
                new Estudiante("Jose Alejandro Martinez Arias", "6", "jose.martinez-a@escuelaing.edu.co", "21"),
                new Estudiante("Juan Perez", "5", "miguelQhotmain.com", "4")
        );

        String saludos = MensajeBienvenida.presentacion(estudiantes);
        System.out.println(saludos);
    }
}
