package Laboratorio1.Reto1;

import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {

    public static String presentacion(List<Estudiante> students){

        String greetings = students.stream()
                .map(Estudiante::toString)
                .collect(Collectors.joining(", y ",
                        "!Hola, bienvenidos! Somos la pareja conformada por ",
                        students.stream().map(Estudiante::getEmail)
                                .collect(Collectors.joining(" y ",". Nuestros correos son: ","."))));
        return greetings;
    }
}
