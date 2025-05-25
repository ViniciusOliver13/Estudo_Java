package Lista_Exercicio.Criacao_Classes.Ex37;

public class Contador {
    private int contador;

    public void encrementar(){
        this.contador++;
    }

    public void zerar(){
        this.contador = 0;
    }

    public void imprimir(){
        System.out.println("Contagem atual: " + contador);
    }
}
