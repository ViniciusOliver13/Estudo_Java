package Lista_Exercicio.Colecoes_Genericas.Ex94;

import java.util.TreeMap;

public class ContarLetras {
    public static void main(String[] args) {
        TreeMap <Character, Integer> mapa = new TreeMap<>();
        String palavra = "HELLO THERE".replace(" ", "");

        for (int i = 0; i < palavra.length(); i++) {
            Character letra = palavra.charAt(i);
            if (!mapa.containsKey(letra)){
                mapa.put(letra, 1);

            }else{
                int qtd = mapa.get(letra);
                mapa.put(letra, ++qtd);
            }
        }

        for (char chave : mapa.keySet()) {
            System.out.println(chave + " apareceu " + mapa.get(chave) + " vezes");
        }
    }
}
