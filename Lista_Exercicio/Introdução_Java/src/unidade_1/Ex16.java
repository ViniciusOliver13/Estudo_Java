package unidade_1;

/* 
   16. Escreva um programa que determine quais são todos os números de 3 algarismos cuja
   soma dos cubos de seus algarismos sejam iguais ao próprio número.
*/

public class Ex16 {
    public static void main(String[] args) {
        double soma, n1, n2, n3;

        for (int i = 100; i < 1000; i++){
            n1 = i / 100;
            n2 = (i % 100) / 10;
            n3 = (i % 100) % 10;

            soma = Math.pow(n1, 3);
            soma += Math.pow(n2, 3);
            soma += Math.pow(n3, 3);

            if (soma == i) {
                System.out.println("O número " + i + " é formado pela soma dos cubos");
            }
        }
    }
}
