package Laboratorio1.Reto6;

import java.util.Map;

import java.util.LinkedHashMap;

public class Comandos {
    private final Map<String, Runnable>  comandos = new LinkedHashMap<>();

    public Comandos(){
        comandos.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del Tiempo y del código!"));
        comandos.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("ANALIZAR", () -> System.out.println("Analizando datos... ¡Eres increíble!"));
        comandos.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
        comandos.put("DESPEDIR", () -> System.out.println("Hasta la próxima compilación, viajero."));
        comandos.put("CANTAR", () -> System.out.println("La la la... compilando melodías en tiempo real."));
        comandos.put("GRITAR", () -> System.out.println("¡¡¡STACK OVERFLOOOOOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("psst... revisa el punto y coma de la línea 42."));
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

    public void fragmentoEstudianteB(String comando) {
        switch (comando.toUpperCase()) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("¡¡¡STACK OVERFLOOOOOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("psst... revisa el punto y coma de la línea 42.");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... ¡Eres increíble!");
                break;
            default:
                break;
        }
    }

    public Map<String, Runnable> getComandos() {
        return comandos;
    }

    public void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando.toUpperCase());
        if (accion != null) {
            accion.run();
        }
    }

}
