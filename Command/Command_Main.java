package Command;

public class Command_Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Command ligar = new LigarLampada(lampada);
        Botao botao = new Botao(ligar);

        botao.pressionar();
    }
}
