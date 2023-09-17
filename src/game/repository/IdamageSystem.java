package game.repository;

public interface IdamageSystem {

    public int TotalDamage(int totalDamage);

    public double TotalCritDamage(double totalCritDamage);

    public void damageMsg();

    public void critDamageMsg();

    public void defenseMsg();

}
