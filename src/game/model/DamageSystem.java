package game.model;

import game.repository.IdamageSystem;

public abstract class DamageSystem extends Character implements IdamageSystem {

    public DamageSystem(int strength, int speed, int intelligence, int life, int skill) {
        super(strength, speed, intelligence, life, skill);
    }

    //sobrescrevendo o método criado na interface IdamageSystem e gerando o cálculo do dano total
    @Override
    public double TotalDamage(double totalDamage) {
        totalDamage = ((((((getIntelligence() * 0.4) + (getLife() * 0.30) + (getSpeed() * 0.1) + (getStrength() * 0.16)) * 0.4) * getSkill()) + getArmor() * 2) + getWeapon() * 2);

        return totalDamage;
    }

    //método para obter o dano
    public double getTotalDamage(){
        return TotalDamage(0);
    }

    //sobrescrevendo o método criado na interface IdamageSystem e gerando o cálculo do dano crítico total
    @Override
    public double TotalCritDamage(double totalCritDamage) {
        totalCritDamage = ((((((getIntelligence() * 0.8) + (getLife() * 0.5) + (getSpeed() * 0.2) + (getStrength() * 0.25)) * 0.9) * getSkill()) + getArmor() * 2) + getWeapon() * 2);

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
    public void CritAttack() {
        System.out.println("Você atacou o inimigo e acertou um crítico!! Deu " + getTotalCritDamage() + " de dano em seu inimigo!");
    }
}
