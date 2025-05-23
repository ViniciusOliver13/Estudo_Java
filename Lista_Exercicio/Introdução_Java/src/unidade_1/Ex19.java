package unidade_1;

/* 
    19. Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva, 
    exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
    Faça o melhor que você puder para tornar a saída limpa, interessante e significativa.
*/

public class Ex19 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <= n; i++) {
            System.out.println("\t".repeat(i) + i + "! = " + fatorial(i));
        }   
    }

    // Função recursiva para calcular fatorial
    public static int fatorial(int n) {
        if (n == 0) {
            return 1; // Caso base: 0! = 1
        } else {
            return n * fatorial(n - 1); // Passo recursivo: n! = n * (n-1)!
        }
    }
}
