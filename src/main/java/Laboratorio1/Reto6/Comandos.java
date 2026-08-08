package Laboratorio1.Reto6;


import java.util.HashMap;
import java.util.Map;

public class Comandos {
    private final Map<String, Runnable> comandos = new HashMap<>();

    public Comandos() {
        comandos.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del Tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("Hasta la próxima compilación, viajero."));
        comandos.put("CANTAR", () -> System.out.println("La la la... compilando melodías en tiempo real."));
        comandos.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
    }

    public void fragmentoEstudianteA(String comando) {
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del Tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Hasta la próxima compilación, viajero.");
                break;
            case "CANTAR":
                System.out.println("La la la... compilando melodías en tiempo real.");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;
            default:
               System.out.println("Comando no valido");
                break;
            }
        }

    }
