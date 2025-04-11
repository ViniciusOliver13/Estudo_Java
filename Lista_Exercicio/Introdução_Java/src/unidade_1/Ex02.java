package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
    valores reais serão informados pelo usuário.
*/
public class Ex02 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double numeros[] = new double[3];

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = teclado.nextDouble();
        }

        double mediaArit = (numeros[0] + numeros[1] + numeros[2]) / 3;
        
        System.out.printf("A média aritmética entre os números é %f.\n", mediaArit);
        teclado.close();
    }
}
