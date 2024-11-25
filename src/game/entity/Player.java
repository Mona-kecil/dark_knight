public class Player implements Entity {
    protected String name;
    protected int hp;
    protected int baseAttack;
    protected Item item;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.baseAttack = 20;
        this.item = null;
    }

    public void attack() {
        int damage = (int) (Math.random() * this.baseAttack);
        System.out.println("You hit the enemy for " + damage + " HP");
    }

    public void take_damage(int damage) {
        this.hp -= damage;
    }

    public boolean has_item() {
        return this.item != null;
    }

    public void remove_item() {
        if (this.item instanceof Excalibur) {
            set_baseAttack(20);
        } else if (this.item instanceof RingOfHealth) {
            set_hp(this.hp - 40);
        }
        System.out.println("Enemy stole your " + this.item.getName());
        this.item = null;
    }

    public void set_item(Item item) {
        this.item = item;
        if (this.item instanceof RingOfHealth) {
            set_hp(this.hp + 40);
        } else if (this.item instanceof Excalibur) {
            set_baseAttack((int) (this.baseAttack * 1.1));
        }
    }

    public void set_hp(int hp) {
        this.hp = hp;
    }

    public void set_baseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }
}
