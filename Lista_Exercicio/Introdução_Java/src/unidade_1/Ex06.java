package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    6. Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
    imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
    minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.
*/
public class Ex06 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int minutos;

        System.out.println("Informe um tempo expresso em minutos: ");
        minutos = teclado.nextInt();

        int dias = minutos / 1440;
        int horas = (minutos - (dias * 1440)) / 60;
        int novosMinutos = (minutos - (dias * 1440)) % 60;

        System.out.printf("%d = %d dias, %d horas e %d minutos.\n", minutos, dias, horas, novosMinutos);

        teclado.close();
    }
}
