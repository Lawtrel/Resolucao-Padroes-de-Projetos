package TemplateMethod;

public abstract class BebidaQuente {

    // Template Method
    public final void prepararBebida() {
        ferverAgua();
        preparar();
        servirNaXicara();
    }

    public void ferverAgua() {
        System.out.println("Fervendo a água...");
    }

    public void servirNaXicara() {
        System.out.println("Servindo na xícara...");
    }

    // Passo que será implementado pelas subclasses
    public abstract void preparar();
}
