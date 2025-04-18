public class MSN extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem: MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem: MSN");
    }
}
