package unidade_1;

import java.text.DecimalFormat;

/* 
    13. Escreva umprograma para imprimir uma versão aproximada de um cartão da Mega-Sena
    (somente com os números, respeitando o número de linhas e a distribuição dos números
    nas linhas).
*/

public class Ex13 {
    public static void main(String[] args) {

        DecimalFormat formato = new DecimalFormat("00");

        for (int quadros = 0; quadros < 3; quadros++){
            System.out.println("----------------------------------------------------------");

            for (int i = 1; i <= 60; i++){
                System.out.print("[" + formato.format(i) + "]  ");

                if (i % 10 == 0) {
                    System.out.print("\n");
                }
            }
            
            System.out.println("----------------------------------------------------------");
        }
    }
}
