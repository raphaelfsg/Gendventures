package game;

import game.model.EnemyWarrior;
import game.model.Equips;
import game.model.Warrior;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Equips[] sword = Warrior.getSwordWarrior();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(sword.length);
        int swordWarrior = sword[index].getEquipDamage();

        Warrior warrior = new Warrior(50, 25, 10, 200, swordWarrior, 50);

        int totalDamage = warrior.getTotalDamage();

        System.out.println("Total damage: " + totalDamage);


        EnemyWarrior enemyWarrior = new EnemyWarrior(50, 25, 10, 200, 15, 50);

//        System.out.println("Força");
//        enemyWarrior.setStrength(sc.nextInt());
//        System.out.println("velocidade");
//        enemyWarrior.setStrength(sc.nextInt());
//        System.out.println("inteligencia");
//        enemyWarrior.setIntelligence(sc.nextInt());
//        System.out.println("vida");
//        enemyWarrior.setLife(sc.nextInt());
//        enemyWarrior.setWeaponDamage(swordWarrior);


        int vidaDepoisDano = enemyWarrior.defense();

        System.out.println("Vida depois do dano: " + vidaDepoisDano);

        warrior.damageMsg();

        enemyWarrior.defenseMsg();


    }
}