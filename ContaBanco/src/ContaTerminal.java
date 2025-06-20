import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os dados do usuário
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do Enter após o número

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final
        System.out.println("Olá " + nomeCliente + 
        ", criada a conta em nosso banco. " +
        "Sua agência é " + agencia + 
                ", conta " + numero + 
                        " e seu saldo " + saldo + " já estara disponível para saque.");

        // Fecha o Scanner
        scanner.close();
    }
}
