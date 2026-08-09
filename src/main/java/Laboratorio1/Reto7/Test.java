package Laboratorio1.Reto7;


import java.util.ArrayList;
import java.util.List;

public abstract class Test {

    protected final Long prizeByPlayerEliminated;
    protected List<Player> playersActive;
    protected List<Player> playersEliminated;

    public Test(Long prizeByPlayerEliminated) {
        this.prizeByPlayerEliminated = prizeByPlayerEliminated;
        this.playersActive = new ArrayList<>();
        this.playersEliminated = new ArrayList<>();
    }

    public abstract List<Player> playTest(List<Player> jugadores);

    public abstract String resultTest();

    public List<Player> getPlayersEliminated() {
        return playersEliminated;
    }

    public long calculatePrizeTest() {
        return (long) playersEliminated.size() * prizeByPlayerEliminated;
    }

    public List<Player> getPlayersActive() {
        return playersActive;
    }
}