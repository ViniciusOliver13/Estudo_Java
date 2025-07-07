import java.util.Scanner;
import java.util.InputMismatchException;

public class Soma {
    public static void main(String[] args) {
        
        int valor1 = obterIntValido();
        int valor2 = obterIntValido();

        int soma = valor1 + valor2;

        System.out.println("A soma dos valores é: " + soma);
    }

    public static int obterIntValido(){
        int valor = 0;
        boolean valido = false;
        Scanner sc = new Scanner(System.in);

        while (!valido) {
            try {
                System.out.print("Digite um número inteiro: ");
                valor = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Tente novamente.");
                sc.nextLine(); 
            }
        }
        sc.close();

        return valor;
    }
}
