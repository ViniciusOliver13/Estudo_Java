package unidade_1;

import java.util.Scanner;

/* 
    12. O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
    o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
    da semana correspondente.
*/

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia;

        System.out.println("Informe o dia do mês: ");
        dia = leitor.nextInt();

        if (dia >= 1 && dia <= 28){
            dia = dia % 7;

            switch (dia) { 
                case 1:
                    System.out.println("Domingo");
                break;
                
                case 2:
                    System.out.println("Segunda-feira");
                break;
                    
                case 3:
                    System.out.println("Terça-feira");
                break;

                case 4:
                    System.out.println("Quarta-feira");
                break;

                case 5:
                    System.out.println("Quinta-feira");
                break;

                case 6:
                    System.out.println("Sexta-feira");
                break;

                case 0:
                    System.out.println("Sábado");
                break;
            }
            
        }else{
            System.out.println("Dia inválido!");
        }
        
        leitor.close();
    }
}
