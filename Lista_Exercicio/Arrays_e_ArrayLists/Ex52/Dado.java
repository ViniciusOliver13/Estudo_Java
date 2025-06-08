package Lista_Exercicio.Arrays_e_ArrayLists.Ex52;

import java.util.Random;

public class Dado {
    private Random gerador;

    public Dado(){
        this.gerador = new Random();
    }

    public int lancarDado(){
        return gerador.nextInt(6) + 1;
    }
}
