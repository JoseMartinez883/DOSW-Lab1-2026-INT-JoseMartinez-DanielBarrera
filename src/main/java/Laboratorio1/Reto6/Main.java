package Laboratorio1.Reto6;

import java.util.Map;

public class Main {


    static void main(String[] args) {
        Comandos comandos = new Comandos();

        /*
        comandos.ejecutarComando("SALUDAR");
        comandos.ejecutarComando("BROMEAR");
        comandos.ejecutarComando("ANALIZAR");
        comandos.ejecutarComando("DANZAR");
        comandos.ejecutarComando("DESPEDIR");
        comandos.ejecutarComando("CANTAR");
        comandos.ejecutarComando("GRITAR");
        comandos.ejecutarComando("SUSURRAR");
          */

        Map<String,Runnable> acciones = comandos.getComandos();
        acciones.forEach((cmd,accion) -> accion.run());
    }
}
