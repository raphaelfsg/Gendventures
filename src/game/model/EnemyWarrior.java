package game.model;

import game.repository.IdamageSystem;
import game.repository.Iequips;
import game.repository.Ifight;

import java.util.Random;

import static game.model.Equips.setShieldWarrior;
import static game.model.Equips.setSwordWarrior;


public class EnemyWarrior extends Character implements Ifight, IdamageSystem, Iequips {

    private int weaponDamage;
    private int armorDefense;


    public EnemyWarrior(String name, int strength, int speed, int intelligence, int life) {
        super(name, strength, speed, intelligence, life);
        this.weaponDamage = weaponDamage;
        this.armorDefense = armorDefense;
    }

    @Override
    public int getWeaponDamage() {
        return setSwordWarrior();
    }

    public int setWeaponDamage(int weaponDamage) {
        return this.weaponDamage = weaponDamage;
    }

    @Override
    public int getArmorDefense() {
        return setShieldWarrior();
    }

    public int setArmorDefense(int armorDefense) {
        return this.armorDefense = armorDefense;
    }

    public static EnemyWarrior[] getEnemyWarrior() {
        EnemyWarrior[] enemyWarriors = new EnemyWarrior[3];
        enemyWarriors[0] = new EnemyWarrior("King Arthur", 60, 50, 20, 70 );
        enemyWarriors[1] = new EnemyWarrior("Joana D'Arc", 70, 50, 0, 80 );
        enemyWarriors[2] = new EnemyWarrior("Urd", 60, 50, 20, 70 );
        return enemyWarriors;
    }

    public static EnemyWarrior setEnemyWarrior() {
        EnemyWarrior[] enemyWarrior = getEnemyWarrior();
        int index = new Random().nextInt(getEnemyWarrior().length);
        EnemyWarrior enemyRandom = enemyWarrior[index];
        return enemyRandom;
    }

    // Cálculo de dano
    @Override
    public int TotalDamage() {
        int totalDamage = ((getIntelligence() + (getLife() / 10) + ((getSpeed() * 2) + getStrength())) + (getWeaponDamage() / 2));

        return totalDamage;
    }

    //método para obter o dano
    public int getTotalDamage(){
        return TotalDamage();
    }

    //sobrescrevendo o método criado na interface IdamageSystem e gerando o cálculo do dano crítico total
    @Override
    public int TotalCritDamage() {
        int totalCritDamage = ((getIntelligence() + (getLife() / 10) + ((getSpeed() * 2) + getStrength())) + (getWeaponDamage() / 2));

        return totalCritDamage;
    }

    //método para obter o dano crítico
    public double getTotalCritDamage() {
        return TotalCritDamage();
    }




    //Sobrescrevendo o método void criado na interface IdamageSystem e imprimindo o dano crítico total
    @Override
    public void critDamageMsg() {
        System.out.println("Você atacou o inimigo e acertou um crítico!! Deu " + getTotalCritDamage() + " de dano em seu inimigo!");
    }

    @Override
    public int attack() {
        double sorte = Math.random();
        if(sorte < 0.95) {
            return life -= getTotalDamage();
        } else {
            return life -= getTotalCritDamage();
        }
    }

    //Sobrescrevendo o método void criado na interface IdamageSystem e imprimindo o dano total
    @Override
    public void damageMsg() {
        System.out.println("Você atacou e gerou " + getTotalDamage() + " de dano em seu inimigo!");
    }

    @Override
    public int TotalDefense() {
        int totalDefense = (getIntelligence() * 2) + ((getSpeed() * 2) + (getArmorDefense() * 2));

        return totalDefense;
    }

    @Override
    public void defenseMsg() {
        System.out.println("Malucooo que dano " + defense());
    }

    @Override
    public int defense() {
        double sorte = Math.random();
        if (sorte < 0.98) {
            return life -= getTotalDamage() / 3;
        } else {
            return life -= getTotalDamage() / 5;
        }

    }



}