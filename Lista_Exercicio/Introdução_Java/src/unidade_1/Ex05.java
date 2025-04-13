package unidade_1;
import java.util.Locale;
import java.util.Scanner;

/* 
    5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
    Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
    variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
    ser reescrito como 312.
*/
public class Ex05 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        String entrada;
        int centena, dezena, unidade;
        
        System.out.println("Digite um número no formato CDU (Centena,Dezena e Unidade): ");
        entrada = teclado.nextLine();
        
        if (entrada.length() == 3){
            int numero = Integer.parseInt(entrada);

            centena = numero / 100;
            dezena = (numero % 100) / 10;
            unidade = (numero % 100) % 10;

            System.out.printf("Número informado no formado UCD: %d%d%d\n", unidade, centena, dezena);
            
        }else{
            System.out.println("Erro! Informe um valor válido.");
        }
        
        teclado.close();
    }
}

