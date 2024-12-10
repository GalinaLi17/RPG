public class WeakPlayer extends Player {
    public WeakPlayer(int hp, String name, int damage) {
        super(hp, name, damage);
    }

    @Override
    public void scream() {
        System.out.println("I'm a weak player");
    }
}
