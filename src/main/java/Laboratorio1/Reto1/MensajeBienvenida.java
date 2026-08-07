package Laboratorio1.reto1;

import java.util.List;
import java.util.stream.Collectors;

public class  MensajeBienvenida {



    public static String presentacion(List<Estudiante> estudiantes){

        String saludos = estudiantes.stream()
                .map(Estudiante::toString)
                .collect(Collectors.joining(", y ","!Hola, bienvenidos! Somos la pareja comformada por ",
                        estudiantes.stream()
                                .map(Estudiante::getCorreo)
                                .collect(Collectors.joining(" y ",". Nuestros correos son: ","."))));

        return saludos;
    }
}
