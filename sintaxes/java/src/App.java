import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            double saldoInicial = validarValorInformado(scanner);
            double saldoFinal = saldoInicial;
            for (int i = 1; i <= 3; i++)
                saldoFinal += validarValorInformado(scanner);
            System.out.printf("%.2f\n", saldoFinal);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static Double validarValorInformado(Scanner scanner) {
        double valor = 0.0;
        try {
            valor = scanner.nextDouble();
        } catch (Exception e) {
            scanner.nextLine();
            valor = validarValorInformado(scanner);
        }
        return valor;
    }

    public static void clasificaCliente(Scanner scanner) {
        double saldo = scanner.nextDouble();

        if(saldo < 0.0)
          System.out.println("Negativado");
        else if(saldo >= 0.0 && saldo < 500.0)
          System.out.println("Baixo");
        else
          System.out.println("Confortavel");
          
        scanner.close();
    }
}
