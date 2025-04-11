package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    3. Escreva um programa que receba um ângulo em graus e o converta para sua represen
    tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
    cotangente do ângulo
*/
public class Ex03 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double anguloGraus;

        System.out.println("Informe o valor do ângulo em Graus: ");
        anguloGraus = teclado.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);

        System.out.printf("O valor do ângulo %f em Radianos é %f.\n", anguloGraus, anguloRadianos);

        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        System.out.println("Valores trigonométricos associados ao ângulo convertido:");
        System.out.printf("Seno: %f\n", seno);
        System.out.printf("Cosseno: %f\n", cosseno);
        System.out.printf("Tangente: %f\n", tangente);
        System.out.printf("Cossecante: %f\n", 1 / seno);
        System.out.printf("Secante: %f\n", 1 / cosseno);
        System.out.printf("Cotangente: %f\n", 1 / tangente);
        
        teclado.close();
    }
}
