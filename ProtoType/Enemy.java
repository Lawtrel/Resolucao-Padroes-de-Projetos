package ProtoType;
public class Enemy implements EnemyPrototype {
    private String type;
    private int health;
    private int damage;
    private String weapon;
    private String color;

    public Enemy(String type, int health, int damage, String weapon, String color) {
        this.type = type;
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;
        this.color = color;
    }

    @Override
    public void attack() {
        System.out.println(type + " ataca com " + weapon + " causando " + damage + " de dano.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Tipo: " + type + ", Vida: " + health + ", Dano: " + damage + ", Arma: " + weapon + ", Cor: " + color);
    }

    @Override
    public EnemyPrototype clone() {
        return new Enemy(type, health, damage, weapon, color); // cria nova instância com os mesmos valores
    }
}
