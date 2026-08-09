package Laboratorio1.reto7;


public class Player {

    private String number;
    private String name;
    private String lastName;
    private Long debt;
    private Long prize;
    private State state;


    public Player() {
    }

    public Player(String numero, String name,String lastName, Long debt) {
        this.number = numero;
        this.name = name;
        this.lastName = lastName;
        this.debt = debt;
        this.state = State.ACTIVO;
        this.prize = 0L;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDebt() {
        return debt;
    }

    public void setDebt(Long debt) {
        this.debt = debt;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Long getPrize() {
        return prize;
    }

    public void setPrize(Long prize) {
        this.prize = prize;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", debt=" + debt +
                ", prize=" + prize +
                ", state=" + state +
                '}';
    }
}
