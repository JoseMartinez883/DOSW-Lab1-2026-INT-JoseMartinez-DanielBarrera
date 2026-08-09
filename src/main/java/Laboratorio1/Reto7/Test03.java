package Laboratorio1.Reto7;

import java.util.List;
import java.util.stream.Collectors;

public class Test03 extends Test {

    public Test03() {
        super(100000000L);
    }

    @Override
    public List<Player> playTest(List<Player> players) {

        return List.of(null);
    }

    @Override
    public String resultTest() {
        String nombresPasaron = playersActive.stream()
                .map(Player::getLastName)
                .collect(Collectors.joining(", "));

        String numerosEliminados = playersEliminated.stream()
                .map(Player::getNumber)
                .collect(Collectors.joining(", "));

        return "Prueba 3 - Puente de Cristal:\n" +
                "    " + nombresPasaron + " PASAN\n" +
                "    Jugador " + numerosEliminados + " ELIMINADO";
    }

}
