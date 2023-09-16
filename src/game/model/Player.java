package game.model;

public class Player extends Character {

    private String nome;

    public Player(String nome, int strength, int speed, int intelligence, int life, int skill) {
        super(strength, speed, intelligence, life, skill);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}