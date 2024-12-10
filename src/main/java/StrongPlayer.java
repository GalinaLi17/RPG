public class StrongPlayer extends Player {
    public StrongPlayer(int hp, String name, int damage) {
        super(hp, name, damage);
    }
    @Override
    public void scream() {
        System.out.println("I'm strong player");
    }
}
