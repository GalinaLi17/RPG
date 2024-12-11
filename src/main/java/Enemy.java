public class Enemy extends Entity{
    int poisonPoints;

    public Enemy(int hp, String name, int poisonPoints) {
        super(hp, name);
        this.poisonPoints = poisonPoints;
    }

    public int getPoisonPoints() {
        return poisonPoints;
    }

    public void setPoisonPoints(int poisonPoints) {
        this.poisonPoints = poisonPoints;
    }

    public void poison(Entity entity) {
        entity.hp -= poisonPoints;
    }

    @Override
    public void scream() {
        System.out.println("I'm enemy");
    }
}
