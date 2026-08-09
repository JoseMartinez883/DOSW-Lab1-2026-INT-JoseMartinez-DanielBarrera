package Laboratorio1.Reto7;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final Long initialPrize = 150000000000L;
    private long totalPrize;
    private List<Player> players;
    private List<Test> tests;

    public Game(List<Player> players){
        totalPrize = initialPrize;
        this.players = players;
        this.tests = new ArrayList<>();
        tests.add(new Test02());
        tests.add(new Test03());
    }

    public void playTests(){
        tests.forEach(test -> {
            players = test.playTest(players);
            System.out.println(test.resultTest());

            if(players.isEmpty()){
                System.out.println("Nadie gano :(");
            } else {
                totalPrize += test.calculatePrizeTest();
                recalculateTotalPrize(players);
            }
        });

        showWinners(players);
    }

    private void recalculateTotalPrize(List<Player> players) {
        long individualPrize = totalPrize / players.size();
        players.forEach(
                player-> player.setPrize(individualPrize)
        );
    }

    private void showWinners(List<Player> players) {
        players.forEach(
                player -> {
                    player.setState(State.GANADOR);
                    System.out.println( "¡jugador " + player.getNumber() + " Eres el Ganador!");
                    System.out.println("Premio: " + player.getPrize() + " wones");
                }
        );
    }

}
