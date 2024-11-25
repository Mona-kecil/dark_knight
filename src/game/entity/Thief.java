public class Thief extends Enemy {
    public Thief() {
        super(60, 15);
    }

    @Override
    public void attack() {
        int damage = (int) (Math.random() * this.baseAttack);
        System.out.println("Thief attack you for " + damage + " HP");
    }

    public void steal_weapon(Player player) {
        player.remove_item();
    }
}
