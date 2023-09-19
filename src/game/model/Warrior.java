package game.model;

import game.repository.IdamageSystem;
import game.repository.Iequips;
import game.repository.Ifight;

import static game.model.Equips.*;


public class Warrior extends Character implements Ifight, IdamageSystem, Iequips {

    private int weaponDamage;
    private int armorDefense;


    public Warrior(String name, int strength, int speed, int intelligence, int life) {
        super(name, strength, speed, intelligence, life);
        this.weaponDamage = weaponDamage;
        this.armorDefense = armorDefense;
    }

    public Warrior() {}

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
    public int getTotalCritDamage() {
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