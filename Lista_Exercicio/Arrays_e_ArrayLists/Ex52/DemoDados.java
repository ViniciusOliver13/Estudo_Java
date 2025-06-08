package Lista_Exercicio.Arrays_e_ArrayLists.Ex52;

public class DemoDados {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int somas[] = new int[11];
        int valor;

        for (int i = 0; i < 36000000; i++) {
            valor = dado1.lancarDado() + dado2.lancarDado();
            somas[valor - 2] += 1;
        }

        for (int i = 0; i < somas.length; i++) {
            System.out.println("Somas de " + (i + 2) + ": " + somas[i]);
        }
    }
}
