import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner terminal = null;
        try {
            terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("Atênção: ".concat(exception.getMessage()));
        } catch (Exception exception) {
            System.out.println("Falha: ".concat(exception.getMessage()));
        } finally {
            if (terminal != null)
                terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
        System.out.println("Contagem finalizada.");
    }
}
