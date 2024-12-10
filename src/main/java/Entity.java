public class Entity {
    int hp;
    String name;

    public Entity(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }


    public void scream() {
        System.out.println("I'm entity");
    }

}
