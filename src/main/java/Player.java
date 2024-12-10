public class Player extends Entity{
    int damage;

    public Player(int hp, String name, int damage) {
        super(hp, name);
        this.damage = damage;
    }

    @Override
    public void scream() {
        System.out.println("I'm player");
    }

    public void heat(Enemy enemy) {
        enemy.hp -= damage;
    }

}
