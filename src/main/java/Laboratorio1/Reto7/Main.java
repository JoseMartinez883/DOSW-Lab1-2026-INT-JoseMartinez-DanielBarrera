package Laboratorio1.Reto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String playerString = "";

        Function<String, Player> stringToPlayer = jugador -> {
            jugador = jugador.replace("deuda:","");
            jugador = jugador.replace("-","");

            List<String> playerInformation = Stream.of(jugador.split(" "))
                    .map(String::trim)
                    .filter( information -> !information.isEmpty())
                    .toList();

            return new Player(playerInformation.getFirst(),
                    playerInformation.get(1), playerInformation.get(2),
                    NumberParser.parseFormattedString(playerInformation.getLast()));
        };

        List<Player> players = new ArrayList<>();

        while (true){
            playerString = sc.nextLine();

            if(!playerString.isEmpty()){
                Player player = stringToPlayer.apply(playerString);
                players.add(player);
            } else {
                break;
            }
        }

        sc.close();

        Game game = new Game(players);
        game.playTests();
    }
}