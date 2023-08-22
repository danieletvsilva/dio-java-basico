import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo = 250.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Qual o número da sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("E o número da conta: ");
        numero = scanner.nextInt();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s e seu saldo de R$%.2f já está disponível para saque.",
                nomeCliente, agencia, saldo);
    }
}
