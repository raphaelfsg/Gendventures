package game.model;
// Aqui o jogador herda os elemenos de personagem e incrementa o nome
public class Player extends Character {

    public Player(String name, int strength, int speed, int intelligence, int life) {
        super(name, strength, speed, intelligence, life);
    }
}