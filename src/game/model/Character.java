package game.model;
import game.model.Equips;
public abstract class Character {

    private int strength;
    private int speed;
    private int intelligence;
    private int life;
    private int skill;

    public Character(int strength, int speed, int intelligence, int life, int skill) {

        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
        this.life = life;
        this.skill = skill;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strenght) {
        this.strength = strenght;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}