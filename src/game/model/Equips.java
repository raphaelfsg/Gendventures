package game.model;

public class Equips {

    private int equipDamage;
    private int equipDefense;

    public Equips(int equipDamage, int equipDefense) {
        this.equipDamage = equipDamage;
        this.equipDefense = equipDefense;
    }

    public int getEquipDamage() {
        return equipDamage;
    }

    public void setEquipDamage(int equipDamage) {
        this.equipDamage = equipDamage;
    }

    public int getEquipDefense() {
        return equipDefense;
    }

    public void setEquipDefense(int equipDefense) {
        this.equipDefense = equipDefense;
    }

    public static Equips[] getSwordWarrior() {
        Equips[] swordWarrior = new Equips[3];
        swordWarrior[0] = new Equips(10, 0);
        swordWarrior[1] = new Equips(25, 0);
        swordWarrior[2] = new Equips(50, 0);
        return swordWarrior;
    }

    public static Equips[] getStaffMage() {
        Equips[] sTaffMage = new Equips[3];
        sTaffMage[0] = new Equips(10, 0);
        sTaffMage[1] = new Equips(25, 0);
        sTaffMage[2] = new Equips(50, 0);
        return sTaffMage;
    }

    public static Equips[] getBowArcher() {
        Equips[] bowArcher = new Equips[3];
        bowArcher[0] = new Equips(10, 0);
        bowArcher[1] = new Equips(25, 0);
        bowArcher[2] = new Equips(50, 0);
        return bowArcher;
    }

    public static Equips[] getShieldWarrior() {
        Equips[] shieldWarrior = new Equips[3];
        shieldWarrior[0] = new Equips(0, 10);
        shieldWarrior[1] = new Equips(0, 25);
        shieldWarrior[2] = new Equips(0, 50);
        return shieldWarrior;
    }

    public static Equips[] getCloakWizard() {
        Equips[] cloakWizard = new Equips[3];
        cloakWizard[0] = new Equips(0, 10);
        cloakWizard[1] = new Equips(0, 25);
        cloakWizard[2] = new Equips(0, 50);
        return cloakWizard;
    }

    public static Equips[] getTiaraArcher() {
        Equips[] tiaraArcher = new Equips[3];
        tiaraArcher[0] = new Equips(0, 10);
        tiaraArcher[1] = new Equips(0, 25);
        tiaraArcher[2] = new Equips(0, 50);
        return tiaraArcher;
    }
}