public enum ServicoEnum {
    FACEBOOK("Facebook"),
    MSN("MSN"),
    TELEGRAM("Telegram");

    private String nomeServico;

    ServicoEnum(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }
}
