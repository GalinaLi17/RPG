public class Friend extends Entity{
    int healPoints;

    public Friend(int hp, String name, int healPoints) {
        super(hp, name);
        this.healPoints = healPoints;
    }

    @Override
    public void scream() {
        System.out.println("I'm friend");
    }

    public void heal(Player player) {
        player.hp += healPoints;
    }
}
