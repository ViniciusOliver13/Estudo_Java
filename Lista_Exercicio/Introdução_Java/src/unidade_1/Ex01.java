package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    1. Escreva um programa que calcule a área de um quadrado.
    O valor do lado de um quadrado deverá ser informado pelo usuário
*/
public class Ex01 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double ladoQuadrado;

        System.out.println("Informe a medida do lado do Quadrado: ");
        ladoQuadrado = teclado.nextDouble();

        double areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.printf("A área do Quadrado de lado %.2f é %.2f", ladoQuadrado, areaQuadrado);
        teclado.close();
    }
}
