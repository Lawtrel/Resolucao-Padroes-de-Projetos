package Bridge;

// abstração: mensagem
public class Mensagem {
    private Canal canal;

    public Mensagem(Canal canal) {
        this.canal = canal;
    }

    public void enviarMensagem(String texto) {
        canal.enviar(texto);
    }
}