package Laboratorio1.Reto6;

import java.util.HashMap;
import java.util.Map;

public class Comandos {
    private final Map<String, Runnable>  comandos = new HashMap<>();

    public Comandos(){
        comandos.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("¡¡¡STACK OVERFLOOOOOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("psst... revisa el punto y coma de la línea 42."));
        comandos.put("ANALIZAR", () -> System.out.println("Analizando datos... ¡Eres increíble!"));

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
