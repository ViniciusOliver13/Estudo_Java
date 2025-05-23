package unidade_1;

import java.util.Scanner;

/* 
    11. Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
    informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.
*/

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1, x2;
        double y1, y2;

        System.out.println("Informe o X do 1º ponto (x, y): ");
        x1 = leitor.nextDouble();
        System.out.println("Informe o Y do 1º ponto (x, y): ");
        y1 = leitor.nextDouble();
        System.out.println("Informe o X do 2º ponto (x, y): ");
        x2 = leitor.nextDouble();
        System.out.println("Informe o Y do 2º ponto (x, y): ");
        y2 = leitor.nextDouble();

        System.out.printf("Ponto 1: (%.2f, %.2f)\n", x1, y1);
        System.out.printf("Ponto 2: (%.2f, %.2f)\n", x2, y2);

        if (x2 > x1){
            System.out.println("o segundo ponto está à direita do primeiro.");

        }else if (x2 < x1){
            System.out.println("o segundo ponto está à esquerda do primeiro.");

        }else if (y2 > y1){
            System.out.println("o segundo ponto está acima do primeiro.");

        }else if (y2 < y1){
            System.out.println("o segundo ponto está abaixo do primeiro.");

        }else {
            System.out.println("Os pontos são iguais!");
        }
    
        leitor.close();
    }
}
