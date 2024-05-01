import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu nome inteiro: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

    }
}