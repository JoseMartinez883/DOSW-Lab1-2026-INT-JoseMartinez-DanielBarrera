package Laboratorio1.Reto7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Test02 extends Test {

    private Map<Player, Integer> numberPlayers;
    private Random random;

    public Test02() {
        super(50000000L);
        random = new Random();
        numberPlayers = new HashMap<>();
    }

    @Override
    public List<Player> playTest(List<Player> players) {

        players.forEach(player -> {
            int dado = random.nextInt(6) + 1;
            numberPlayers.put(player, dado);
        });

        playersActive = players.stream()
                .filter(player -> numberPlayers.get(player) % 2 == 0)
                .collect(Collectors.toList());

        playersEliminated = players.stream()
                .filter(player -> !playersActive.contains(player))
                .collect(Collectors.toList());

        playersEliminated.forEach(jugador ->
                jugador.setState(State.ELIMINADO)
        );

        resultTest();
        return playersActive;
    }


    @Override
    public String resultTest() {

        String lastNamePlayersActive = playersActive.stream()
                .map(jugador -> jugador.getLastName() + "(" + numberPlayers.get(jugador) + ")")
                .collect(Collectors.joining(", "));

        String playersNumbersEliminated = playersEliminated.stream()
                .map(Player::getNumber)
                .collect(Collectors.joining(", "));

        return "Prueba 2 - Los Dados:\n" +
                "    " + lastNamePlayersActive + " PASAN\n" +
                "    Jugador " + playersNumbersEliminated + " ELIMINADO";
    }

}
