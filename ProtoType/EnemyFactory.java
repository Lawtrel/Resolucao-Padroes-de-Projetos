package ProtoType;
import java.util.HashMap;
import java.util.Map;

public class EnemyFactory {
    private static final Map<String, EnemyPrototype> prototypes = new HashMap<>();

    static {
        prototypes.put("OrcVerde", new Enemy("Orc", 100, 20, "Machado", "Verde"));
        prototypes.put("GoblinVermelho", new Enemy("Goblin", 50, 10, "Faca", "Vermelho"));
    }

    public static EnemyPrototype createEnemy(String key) {
        EnemyPrototype prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Valor desconhecido: " + key);
        }
        return prototype.clone();
    }
}
