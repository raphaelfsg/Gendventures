package game.model;

import game.repository.Iequips;

import java.util.Random;

public class Equips implements Iequips {

    private int weaponDamage;
    private int armorDefense;

    public Equips(int equipDamage, int equipDefense) {
        this.weaponDamage = weaponDamage;
        this.armorDefense = armorDefense;
    }

    @Override
    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefense() {
        return armorDefense;
    }

    public void setArmorDefense(int armorDefense) {
        this.armorDefense = armorDefense;
    }

    //Gerando três armas para guerreiro
    public static Equips[] getSwordWarrior() {
        Equips[] sword = new Equips[3];
        sword[0] = new Equips(10, 0);
        sword[1] = new Equips(25, 0);
        sword[2] = new Equips(50, 0);
        return sword;
    }

    //Sorteando uma das armas
    public static int setSwordWarrior() {
        Equips[] sword = Equips.getSwordWarrior();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(sword.length);
        int swordWarrior = sword[index].getWeaponDamage();
        return swordWarrior;
    }

    //Escudo do guerreiro
    public static Equips[] getShieldWarrior() {
        Equips[] shieldWarrior = new Equips[3];
        shieldWarrior[0] = new Equips(0, 10);
        shieldWarrior[1] = new Equips(0, 25);
        shieldWarrior[2] = new Equips(0, 50);
        return shieldWarrior;
    }

    public static int setShieldWarrior() {
        Equips[] shield = Equips.getShieldWarrior();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(shield.length);
        int shieldWarrior = shield[index].getArmorDefense();
        return shieldWarrior;
    }




    // Gerando armas do mago
    public static Equips[] getStaffMage() {
        Equips[] sTaffMage = new Equips[3];
        sTaffMage[0] = new Equips(10, 0);
        sTaffMage[1] = new Equips(25, 0);
        sTaffMage[2] = new Equips(50, 0);
        return sTaffMage;
    }

    public static int setStaffMage() {
        Equips[] staff = Equips.getStaffMage();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(staff.length);
        int staffMage = staff[index].getWeaponDamage();
        return staffMage;
    }

    public static Equips[] getCloakWizard() {
        Equips[] cloakWizard = new Equips[3];
        cloakWizard[0] = new Equips(0, 10);
        cloakWizard[1] = new Equips(0, 25);
        cloakWizard[2] = new Equips(0, 50);
        return cloakWizard;
    }

    public static int setCloakMage() {
        Equips[] cloak = Equips.getCloakWizard();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(cloak.length);
        int cloakMage = cloak[index].getArmorDefense();
        return cloakMage;
    }



    public static Equips[] getBowArcher() {
        Equips[] bowArcher = new Equips[3];
        bowArcher[0] = new Equips(10, 0);
        bowArcher[1] = new Equips(25, 0);
        bowArcher[2] = new Equips(50, 0);
        return bowArcher;
    }

    public static int setBowArcher() {
        Equips[] bow = Equips.getBowArcher();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(bow.length);
        int bowArcher = bow[index].getWeaponDamage();
        return bowArcher;
    }

    public static Equips[] getTiaraArcher() {
        Equips[] tiaraArcher = new Equips[3];
        tiaraArcher[0] = new Equips(0, 10);
        tiaraArcher[1] = new Equips(0, 25);
        tiaraArcher[2] = new Equips(0, 50);
        return tiaraArcher;
    }

    public static int setTiaraArcher() {
        Equips[] tiara = Equips.getTiaraArcher();
        //sortear uma das trÊs armas
        int index = new Random().nextInt(tiara.length);
        int tiaraArcher = tiara[index].getArmorDefense();
        return tiaraArcher;
    }
}