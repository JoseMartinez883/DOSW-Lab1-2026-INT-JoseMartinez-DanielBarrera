package Laboratorio1.Reto1;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Estudiante A: ");
        String studentAName = scanner.nextLine();
        System.out.print("  semestre: ");
        String studentAsemester = scanner.nextLine();
        System.out.print("  edad: ");
        String  studentAAge = scanner.nextLine();
        System.out.print("  correo: ");
        String studentAEmail = scanner.nextLine();


        System.out.print("Estudiante B: ");
        String studentBName = scanner.nextLine();
        System.out.print("  semestre: ");
        String studentBsemester  = scanner.nextLine();
        System.out.print("  edad: ");
        String studentBAge = scanner.nextLine();
        System.out.print("  correo: ");
        String studentBEmail = scanner.nextLine();

        List<Estudiante> estudiantes = List.of(
                new Estudiante(studentAName, studentAsemester, studentAEmail, studentAAge),
                new Estudiante(studentBName, studentBsemester, studentBEmail, studentBAge)
        );

        String greetings = MensajeBienvenida.presentacion(estudiantes);
        System.out.println(greetings);
        scanner.close();
    }
}
