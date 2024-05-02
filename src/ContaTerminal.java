import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Limpa a quebra de linha pendente

        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", nomeCliente, agencia, numeroConta, saldo);
    }
}



