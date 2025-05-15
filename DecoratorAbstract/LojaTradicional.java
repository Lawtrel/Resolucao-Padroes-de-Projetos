package DecoratorAbstract;

public class LojaTradicional implements LojaFactory{
    @Override
    public Mesa criarMesa() {
        return new MesaTradicional();
    }

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraTradicional();
    }
}
