public class Main {
    public static void main(String[] args) {
        Player player = new Player(8, 20);
        Room[] dungeon = new Room[5];

        // Create rooms with random creatures
        for (int i = 0; i < dungeon.length; i++) {
            dungeon[i] = new Room();
        }

        boolean escaped = true;
        for (int i = 0; i < dungeon.length; i++) {
            System.out.println("\nEntering room " + (i + 1));
            if (!player.fight(dungeon[i].getCreature())) {
                escaped = false;
                break;
            }
        }

        if (escaped) {
            System.out.println("\nCongratulations! You escaped the dungeon!");
        } else {
            System.out.println("\nGame Over! You were defeated in the dungeon.");
        }
    }
}
