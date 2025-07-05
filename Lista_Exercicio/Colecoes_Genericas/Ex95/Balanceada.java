package Lista_Exercicio.Colecoes_Genericas.Ex95;

import java.util.Scanner;
import java.util.Stack;

public class Balanceada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expressao;

        System.out.println("Digite a expressão: ");
        expressao = sc.nextLine();

        if(estaBalanceado(expressao)){
            System.out.println("Está balanceada!");
        }else{
            System.out.println("Não está balanceada!");
        }

        sc.close();
    }

    public static boolean estaBalanceado(String entrada){
        Stack <Character> pilha = new Stack<>();

        for (char c : entrada.toCharArray()) {
            if (c == '(' ){
                pilha.push(c);

            }else if (c == ')' ){

                if (pilha.isEmpty()){
                    return false;
                }

                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
