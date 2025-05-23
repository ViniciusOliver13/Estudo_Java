package unidade_1;

import java.util.Scanner;

/*  
    14. Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
    que n >0.
*/
public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n, n1 = 0, n2 = 1;
        int soma;

        System.out.println("Informe o n-ézimo termo da série: ");
        n = leitor.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(n1 + " ");

            soma = n2 + n1;
            n1 = n2;
            n2 = soma;
        }

        leitor.close();
    }
}
