package Lista_Exercicio.Colecoes_Genericas.Ex93;

import java.util.LinkedList;

public class LinkedListInversa {
    public static void main(String[] args) {
        LinkedList <Character> lista = new LinkedList<>();
        LinkedList <Character> listaInversa = new LinkedList<>();
        String letras = "abcdfghjkl";

        for (int i = 0; i < 10; i++) {
            lista.add(letras.charAt(i));
        }
        
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInversa.add(letras.charAt(i));
        }

        for (Character caractere : lista) {
            System.out.print(caractere + " ");
        }

        System.out.println();

        for (Character caractere : listaInversa) {
            System.out.print(caractere + " ");
        }
    }
    
}