package game.model;

import game.repository.IdamageSystem;
import game.repository.Iequips;
import game.repository.Ifight;

public class Warrior extends Character implements Ifight, IdamageSystem, Iequips {

    private int weaponDamage;
    private int armorDefense;

    public Warrior(int strength, int speed, int intelligence, int life, int weaponDamage, int armorDefense) {
        super(strength, speed, intelligence, life);
        this.weaponDamage = weaponDamage;
        this.armorDefense = armorDefense;
    }

    @Override
    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int setWeaponDamage(int weaponDamage) {
        return this.weaponDamage = weaponDamage;
    }

    @Override
    public int getArmorDefense() {
        return armorDefense;
    }

    public int setArmorDefense(int armorDefense) {
        return this.armorDefense = armorDefense;
    }

    public static Equips[] getSwordWarrior() {
        Equips[] swordWarrior = new Equips[3];
        swordWarrior[0] = new Equips(10, 0);
        swordWarrior[1] = new Equips(25, 0);
        swordWarrior[2] = new Equips(50, 0);
        return swordWarrior;
    }

    // Cálculo de dano
    @Override
    public int TotalDamage(int totalDamage) {
        totalDamage = (((getIntelligence() + (getLife() / 10)) + ((getSpeed() * 2) + getStrength())) * (getArmorDefense() * 2) + (getWeaponDamage() * 2));

        return totalDamage;
    }

    //método para obter o dano
    public int getTotalDamage(){
        return TotalDamage(0);
    }

    //sobrescrevendo o método criado na interface IdamageSystem e gerando o cálculo do dano crítico total
    @Override
    public double TotalCritDamage(double totalCritDamage) {
        totalCritDamage = ((((((getIntelligence() * 0.8) + (getLife() * 0.5) + (getSpeed() * 0.2) + (getStrength() * 0.25)) * 0.9) * getArmorDefense() * 2) + getWeaponDamage() * 2));

        return totalCritDamage;
    }

    //método para obter o dano crítico
    public double getTotalCritDamage() {
        return TotalCritDamage(0);
    }

    //Sobrescrevendo o método void criado na interface IdamageSystem e imprimindo o dano total
    @Override
    public void damageMsg() {
        System.out.println("Você atacou e gerou " + getTotalDamage() + " de dano em seu inimigo!");
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