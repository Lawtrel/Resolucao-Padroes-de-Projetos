package DecoratorAbstract;

public class CadeiraRustica implements Cadeira{

    @Override
    public void montar() {
        System.out.println("MONTANDO UMA CADEIRA RUSTICA");
    }
}
