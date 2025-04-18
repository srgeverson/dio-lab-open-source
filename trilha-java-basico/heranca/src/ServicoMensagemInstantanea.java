public class ServicoMensagemInstantanea {
    protected void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem: ".concat(mensagem));
    }

    protected void receberMensagem(String mensagem) {
        System.out.println("Recebendo mensagem: ".concat(mensagem));
    }
}
