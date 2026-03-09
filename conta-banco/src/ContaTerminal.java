import java.util.Scanner;

public class ContaTerminal {
    // atributos da conta (declarados na classe, fora do método)
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        String numero = scanner.nextLine();

        System.out.println("Por favor, digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Agência informada: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
