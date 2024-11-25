public class Goblin extends Enemy {
    public Goblin() {
        super(80, 20);
    }

    @Override
    public void attack() {
        int damage = (int) (Math.random() * this.baseAttack);
        System.out.println("Goblin attack you for " + damage + " HP");
    }
}
