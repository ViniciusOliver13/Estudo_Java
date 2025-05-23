package unidade_1;

import java.util.Scanner;

/* 
    9. Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
    treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
    espadas). O programa deve imprimir o nome da carta por extenso.
*/

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int carta;
        int naipe;

        System.out.println("Informe o valor de uma carta (1 - 13): ");
        carta = leitor.nextInt();
        System.out.println("Informe o naipe da carta (1 - 4): ");
        naipe = leitor.nextInt();
        
        if((carta >= 1 && carta <= 13) && (naipe >= 1 && naipe <= 4)){
            
            switch (carta) {
                case 1:
                    System.out.print("Ás de ");
                    break;
                    
                case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                    System.out.print(carta + " ");      // Falta fazer case do nome para cada um dos casos
                    break;

                case 11:
                    System.out.print("Valete de ");
                    break;

                case 12:
                    System.out.print("Dama de ");
                    break;

                case 13:
                    System.out.print("Rei de ");
                    break;
            }

            switch (naipe) {
                case 1:
                    System.out.print("Ouros");
                    break; 

                case 2:
                    System.out.print("Paus");
                    break;

                case 3:
                    System.out.print("Copas");
                    break;

                case 4:
                    System.out.print("Espadas");
                    break;
            }

        }else{
            System.out.println("Erro! Informe valores válidos.");
        }
        
        leitor.close();
    }
}
