package Lista_Exercicio.Colecoes_Genericas.Ex94;

import java.util.TreeMap;

public class ContarLetras {
    public static void main(String[] args) {
        TreeMap <Character, Integer> mapa = new TreeMap<>();
        String palavra = "HELLO THERE".replace(" ", "");

        for (int i = 0; i < palavra.length(); i++) {
            if (!mapa.containsKey(palavra.charAt(i))){
                mapa.put(palavra.charAt(i), 1);

            }else{
                int qtd = mapa.get(palavra.charAt(i));
                mapa.put(palavra.charAt(i), ++qtd);
            }
        }

        for (char chave : mapa.keySet()) {
            System.out.println(chave + " apareceu " + mapa.get(chave) + " vezes");
        }
    }
}
