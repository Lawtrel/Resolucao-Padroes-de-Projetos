package Command;

public class LigarLampada implements Command{
    private Lampada lampada;

    public LigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        lampada.ligar();
    }
}
