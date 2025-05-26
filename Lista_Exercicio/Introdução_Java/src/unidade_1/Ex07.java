package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    7. Escreva um programa que lê três números e determina qual número é o menor
*/
public class Ex07 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double numeros[] = new double[2];
        double menor;

        System.out.printf("Digite o %dº número: ", 1);
        menor = teclado.nextDouble();

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o %dº número: ", i + 2);  
            numeros[i] = teclado.nextDouble();

            if (numeros[i] < menor){
                menor = numeros[i];
            }
            
        }

        System.out.println("O menor número informado foi " + menor);
        teclado.close();
    }
}
