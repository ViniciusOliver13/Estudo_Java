package unidade_1;

import java.util.Scanner;

/* 
    8. Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção
    relâmpago em dois setores:
        • No setor de Eletros, que possui código 222, todas as peças que custam
        mais de R$ 500 vão ter 10% de desconto.
        • No setor de Cama, mesa e banho, que possui código 111, peças com valor
        acima de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e
        R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto
*/

public class Ex08 {
    public static void main(String[] args) {
        int codigo;
        double valorProduto;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o código do setor: ");
        codigo = leitor.nextInt();
        System.out.print("Qual o valor do produto? R$");
        valorProduto = leitor.nextDouble();

        if(codigo == 222){
            if(valorProduto > 500.0){
                valorProduto -= (10.0 / 100.0) * valorProduto;
            }

        }else if(codigo == 111){

            if(valorProduto > 100){
                valorProduto = (40.0 / 100.0) * valorProduto;

            } else if(valorProduto >= 50.0 && valorProduto <= 100.0){
                valorProduto = (20.0 / 100.0) * valorProduto;

            }else{
                valorProduto = (10.0 / 100.0) * valorProduto;
            }

        }else{
            System.out.println("Código do setor inválido!");
        }

        System.out.printf("Valor do produto final R$%.2f", valorProduto);
        leitor.close();

    }

}
