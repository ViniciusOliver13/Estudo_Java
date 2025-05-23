package unidade_1;

/* 
    18. Crie umafunção recursivapotencia (base,expoente) que, quando chamada, retorna base ^ expoente.
    Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
    81 nesse exemplo)
    Assuma que expoente é um inteiro maior ou igual a 1
*/

public class Ex18 {
    public static void main(String[] args) {
        System.out.println(potencia(3, 4)); // Saída: 81
        System.out.println(potencia(2, 8)); // Saída: 32
    }   

     // Função recursiva para calcular base^expoente
    public static int potencia(int base, int expoente) {
        // Caso base: expoente == 1
        if (expoente == 1) {
            return base;
        }
        // Passo recursivo: base * potencia(base, expoente - 1)
        else {
            return base * potencia(base, expoente - 1);
        }
    }

}


