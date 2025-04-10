import java.util.Scanner;;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Declaração das variáveis da Conta Banco
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Variável Teclado, responsável pela leitura das entradas
        Scanner teclado = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("  C O N T A  B A N C O ");
        System.out.println("========================");

        System.out.print("Por favor, digite o número da Conta!\n>>> ");
        numero = teclado.nextInt();
        teclado.nextLine();             // Pega a quebra de linha pendente após o nextInt()  

        System.out.print("Por favor, digite o número da Agência!\n>>> ");
        agencia = teclado.nextLine();

        System.out.print("Por favor, digite seu nome da Conta!\n>>> ");
        nomeCliente = teclado.nextLine();

        System.out.print("Por favor, digite o saldo da sua Conta!\n>>> ");
        saldo = teclado.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, ", nomeCliente, agencia);
        System.out.printf("conta %d e seu saldo R$%.2f já está disponível para saque!\n", numero, saldo);

        teclado.close();
    }
}
