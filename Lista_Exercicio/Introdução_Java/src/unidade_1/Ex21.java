package unidade_1;

//  21. Crie uma função recursiva que verifique se um dado número é primo

public class Ex21 {
    public static void main(String[] args) {
        int numero = 5; // Altere aqui para testar!
        
        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    // Função recursiva principal (chama a auxiliar)
    public static boolean ehPrimo(int n) {
        // Casos base (n ≤ 1 não é primo, 2 é primo)
        if (n <= 1) return false;
        if (n == 2) return true;
        
        // Inicia a verificação a partir do divisor 2
        return ehPrimoAux(n, 2);
    }

    // Função auxiliar recursiva (verifica divisibilidade)
    private static boolean ehPrimoAux(int n, int divisor) {
        // Se divisor chegou na raiz quadrada de n, é primo
        if (divisor * divisor > n) return true;
        
        // Se n é divisível por divisor, não é primo
        if (n % divisor == 0) return false;
        
        // Testa o próximo divisor
        return ehPrimoAux(n, divisor + 1);
    }
}

