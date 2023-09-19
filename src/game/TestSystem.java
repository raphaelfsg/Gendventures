package game;

import game.model.Warrior;

import java.util.Scanner;



public class TestSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Warrior warrior = new Warrior("",50, 25, 10, 200);

        int totalDamage = warrior.getTotalDamage();

        System.out.println("Total damage: " + totalDamage);


      //  EnemyWarrior enemyWarrior = new EnemyWarrior(50, 25, 10, 200);

//        System.out.println("Força");
//        enemyWarrior.setStrength(sc.nextInt());
//        System.out.println("velocidade");
//        enemyWarrior.setStrength(sc.nextInt());
//        System.out.println("inteligencia");
//        enemyWarrior.setIntelligence(sc.nextInt());
//        System.out.println("vida");
//        enemyWarrior.setLife(sc.nextInt());
//        enemyWarrior.setWeaponDamage(swordWarrior);


//        int vidaDepoisDano = enemyWarrior.defense();
//
//        System.out.println("Vida depois do dano: " + vidaDepoisDano);
//
//        warrior.damageMsg();
//
//        enemyWarrior.defenseMsg();


    }
}