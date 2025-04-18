public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.receberMensagem();
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
