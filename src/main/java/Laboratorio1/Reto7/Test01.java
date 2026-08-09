package Laboratorio1.Reto7;

import java.util.List;
import java.util.stream.Collectors;

public class Test01 extends Test {
    private static final Long allowableDebt = 170000000L;

    public Test01() {
        super(50000000L);
    }

    @Override
    public List<Player> playTest(List<Player> jugadores) {

        playersEliminated = jugadores.stream()
                .filter(jugador -> jugador.getDebt() > allowableDebt)
                .collect(Collectors.toList());

        playersEliminated.forEach(p -> p.setState(State.ELIMINADO));

        playersActive = jugadores.stream()
                .filter(jugador -> jugador.getDebt() <= allowableDebt)
                .collect(Collectors.toList());

        return playersActive;
    }

    @Override
    public String resultTest() {

        String lastNamePlayersActive = playersActive.stream()
                .map(Player::getLastName)
                .collect(Collectors.joining(", "));

        String  playersNumbersEliminated = playersEliminated.stream()
                .map(Player::getNumber)
                .collect(Collectors.joining(", "));

        return "Prueba 1 - Luz Roja Luz Verde:\n" +
                "    " + lastNamePlayersActive + " PASAN\n" +
                "    Jugador " + playersNumbersEliminated + " ELIMINADO" + "\n";
    }

}