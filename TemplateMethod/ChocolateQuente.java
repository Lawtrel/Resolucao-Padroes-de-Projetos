package TemplateMethod;

public class ChocolateQuente extends BebidaQuente {

    @Override
    public void preparar() {
        System.out.println("Adicionando leite em pó...");
        System.out.println("Adicionando achocolatado...");
        System.out.println("Mexendo bem antes de servir...");
    }
}