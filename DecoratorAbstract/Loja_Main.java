package DecoratorAbstract;

public class Loja_Main {
    public static void main(String[] args) {
        LojaFactory factory = new LojaModerna();
        LojaFactory factory1 = new LojaRustica();
        Mesa mesa = factory.criarMesa();
        Cadeira cadeira = factory1.criarCadeira();

        cadeira.montar();
        mesa.montar();
    }
}
