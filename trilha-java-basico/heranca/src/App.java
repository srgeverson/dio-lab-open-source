public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Facebook facebook = new Facebook();
        facebook.enviarMensagem("Facebook");
        facebook.receberMensagem("Facebook");
        MSN msn = new MSN();    
        msn.enviarMensagem("MSN");
        msn.receberMensagem("MSN");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem("Telegram");
        telegram.receberMensagem("Telegram");
    }
}
