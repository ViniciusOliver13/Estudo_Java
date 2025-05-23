package unidade_1;

/* 
    20. Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
    m e n é definido recursivamente como segue:
        • se n > m,retorne mdc(n,m);
        • se n = 0, retorne m;  
        • senão, retorne mdc(n,m%n), onde % é o operador de resto da divisão.
*/

public class Ex20 {
    public static void main(String[] args) {
        int m = 24;
        int n = 18;
        System.out.println("MDC de " + m + " e " + n + " é: " + mdc(m, n)); // Saída: 6
    }

    public static int mdc(int m, int n) {
        // Caso 1: Se n > m, troca os valores
        if (n > m) {
            return mdc(n, m);
        }
        // Caso 2: Se n == 0, retorna m
        else if (n == 0) {
            return m;
        }
        // Caso 3: Recursão com m % n
        else {
            return mdc(n, m % n);
        }
    }
}
