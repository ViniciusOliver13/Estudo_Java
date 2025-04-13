package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    4. Escreva um programa que receba uma temperatura em graus centígrados e a apresente
    em graus Fahrenheit.
*/
public class Ex04 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double temperatura;

        System.out.println("Informe a temperatura em Graus centígrados: ");
        temperatura = teclado.nextDouble();

        double temperaturaFahrenheit = 1.8 * temperatura + 32;
        
        System.out.printf("A temperatura na escola Fahrenheit é %f\n", temperaturaFahrenheit);
        teclado.close();
    }
}