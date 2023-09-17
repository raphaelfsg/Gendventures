package game.model;
// Aqui o jogador herda os elemenos de personagem e incrementa o nome
public class Player extends Character {

    private String nome;

    public Player(String nome, int strength, int speed, int intelligence, int life, int skill) {
        super(strength, speed, intelligence, life);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}