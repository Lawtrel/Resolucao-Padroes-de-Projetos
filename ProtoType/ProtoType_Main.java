package ProtoType;

public class ProtoType_Main {
    public static void main(String[] args) {
        EnemyPrototype enemy = new Enemy("Troll", 150, 30, "Clava", "Cinza");
        enemy.displayInfo();
        enemy.attack();

        System.out.println("\nClonando inimigo...\n");

        EnemyPrototype enemyCopia = enemy.clone();
        enemyCopia.displayInfo();
        enemyCopia.attack();
    }
}
