package DecoratorAbstract;

public class CadeiraTradicional implements Cadeira{
    @Override
    public void montar() {
        System.out.println("MONTANDO UMA CADEIRA TRADICIONAL");
    }
}
