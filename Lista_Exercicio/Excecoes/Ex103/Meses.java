package Lista_Exercicio.Excecoes.Ex103;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.print("Digite um número de 1 a 12 para obter o mês correspondente: ");
        mes = sc.nextInt();

        try{
            System.out.println("Você escolheu o mês: " + meses[mes - 1]);
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Número inválido. Por favor, insira um número entre 1 e 12.");

        }finally {
            sc.close();
        }
    }
}
