package Command;

public class Botao {
    private  Command comand;

    public  Botao(Command comand) {
        this.comand = comand;
    }

    public  void pressionar() {
        comand.executar();
    }
}
