package Lista_Exercicio.Arrays_e_ArrayLists.Ex51;

public class ProdutoNumerico {
    
    public static void produto(int... numeros){
        int produto = 1;

        for (int numero : numeros) {
            produto *= numero;
        }

        System.out.println("O produto entre os números foi de " + produto);
    }
}
