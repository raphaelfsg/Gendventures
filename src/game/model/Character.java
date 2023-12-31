package game.model;

public abstract class Character {

    protected String name;
    private int strength;
    private int speed;
    private int intelligence;
    protected int life;

    public Character(String name, int strength, int speed, int intelligence, int life) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
        this.life = life;
    }

    public Character(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

