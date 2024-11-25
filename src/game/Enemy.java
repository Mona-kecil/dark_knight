package game;

public abstract class Enemy implements Entity {
    public int hp;
    public int baseAttack;

    public Enemy(int hp, int baseAttack) {
        this.hp = hp;
        this.baseAttack = baseAttack;
    }

    public abstract int attack();

    @Override
    public void take_damage(int damage) {
        this.hp -= damage;
    }
}
