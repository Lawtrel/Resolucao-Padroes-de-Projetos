package TemplateMethod;

public class Cafe extends BebidaQuente {

    @Override
    public void preparar() {
        System.out.println("Adicionando o pó de café e coando...");
    }
}
