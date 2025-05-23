package unidade_1;

/* 
    15. Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
    é aquele que é igual à soma dos seus divisores (exceto o próprio número). 
    Exemplos:
    6 =1+2+3,   28=1+2+4+7+14.
*/

public class Ex15 {
    public static void main(String[] args) {
        int i, n = 1;
        int soma = 0;
        int teste = 0;

        while (teste <= 4) {
            i = 1;

            while (i < n) {
                
                if ((n % i == 0) && (n != i)){
                    soma += i;

                }
                i++;
            }

            if (soma == n){
                System.out.println("O número " + n + " é perfeito");
                teste++;
            }
            
            n++;
            soma = 0;
        }
    }    
}
