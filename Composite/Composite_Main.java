package Composite;

public class Composite_Main {
    public static void main(String[] args) {
        Item livro = new Item("Livro Java", 150.00);
        Item caneta = new Item("Caneta", 5.00);

        Caixa caixapequena = new Caixa("Kit Escritorio");
        caixapequena.adicionar(livro);
        caixapequena.adicionar(caneta);

        Caixa caixaGrande = new Caixa("Pedido Completo");
        caixaGrande.adicionar(caixapequena);
        caixaGrande.adicionar(new Item("Nota Fiscal", 0.00));

        caixaGrande.exibir(" ");
        System.out.println("Total: R$" + caixaGrande.getPreco());
    }
}
