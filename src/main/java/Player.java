public class Player extends Entity{
    int damage;

    public Player(int hp, String name, int damage) {
        super(hp, name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void scream() {
        System.out.println("I'm player");
    }

    public void hit(Enemy enemy) {
        enemy.hp -= damage;
    }

}
