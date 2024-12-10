public class Main {
    public static void main(String[] args) {
        Friend friend = new Friend(100, "Roman", 50);
        Enemy enemy = new Enemy(100, "Danil", 10);
        Player player = new Player(100, "Lina", 30);



        System.out.println(friend.hp);
        enemy.poison(friend);
        enemy.scream();
        player.heat(enemy);
        System.out.println(enemy.hp);
        System.out.println(friend.hp);
        friend.heal(player);
        enemy.poison(player);
        System.out.println(player.hp);
    }
}
