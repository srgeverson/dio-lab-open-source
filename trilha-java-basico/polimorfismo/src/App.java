public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ServicoMensagemInstantanea servico = null;
        ServicoEnum servicoEscolhido = ServicoEnum.TELEGRAM;
        switch (servicoEscolhido) {
            case TELEGRAM:
                servico = new Telegram();
                break;
            case MSN:
                servico = new MSN();
                break;
            case FACEBOOK:
                servico = new Facebook();
                break;
            default:
                System.out.println("Serviço não encontrado!");
        }

        servico.enviarMensagem(servicoEscolhido.getNomeServico());
        servico.receberMensagem(servicoEscolhido.getNomeServico());
    }
}
