package TemplateMethod;

public class Template_Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();
        cafe.prepararBebida();

        System.out.println();

        BebidaQuente cha = new Cha();
        cha.prepararBebida();

        System.out.println();

        // Desafio Extra
        BebidaQuente chocolateQuente = new ChocolateQuente();
        chocolateQuente.prepararBebida();
    }
}
