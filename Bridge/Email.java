package Bridge;

public class Email implements Canal {    //implementação do envio de mensagem por e-mail
    public void enviar(String texto) {
        System.out.println("📧 Enviando por E-MAIL: " + texto);
    }
}
