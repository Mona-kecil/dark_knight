package game;

public class Goblin extends Enemy {
    public Goblin() {
        super(80, 20);
    }

    @Override
    public int attack() {
        int damage = (int) (Math.random() * this.baseAttack);
        System.out.println("Goblin attack you for " + damage + " HP");
        return damage;
    }
}
