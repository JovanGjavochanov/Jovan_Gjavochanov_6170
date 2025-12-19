public class TreasureChestGame {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Draco", "Golden Crown", 50);
        Elf elf = new Elf("Elara", "Silver Chalice", 30);
        Goblin goblin = new Goblin("Glim", "Emerald Necklace", 20);

        System.out.println("Interacting with Dragon:");
        dragon.interact();
        dragon.guardTreasure();
        dragon.castCurse(dragon.getCurseDamage());
        System.out.println();

        System.out.println("Interacting with Elf:");
        elf.interact();
        elf.guardTreasure();
        elf.healPlayer(25);
        System.out.println();
        System.out.println("Interacting with Goblin:");
        goblin.interact();
        goblin.guardTreasure();
        goblin.castCurse(goblin.getCurseDamage());
    }
}