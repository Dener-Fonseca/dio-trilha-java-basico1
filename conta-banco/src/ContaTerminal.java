
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da agência: ");
        String nomeAgencia = scanner.nextLine();
        
        System.out.print("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá, " + nomeTitular + ". Você abriu uma conta no banco " + nomeAgencia + " com o número de agência " + numeroAgencia + " e com saldo inicial de R$ " + saldoInicial + ".");
        
        scanner.close();
    }
}
