public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem(String servico) {
        System.out.println("Enviando mensagem: ".concat(servico));
    }

    @Override
    public void receberMensagem(String servico) {
        System.out.println("Recebendo mensagem: ".concat(servico));
    }
}
