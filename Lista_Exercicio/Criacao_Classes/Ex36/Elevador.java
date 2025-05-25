package Lista_Exercicio.Criacao_Classes.Ex36;

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidade;
    int qtdPessoas;

    public Elevador(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.qtdPessoas = 0;
    }

    public void entra(){
        if (qtdPessoas == capacidade){
            System.out.println("Elevador está cheio!");
        }else{
            qtdPessoas++;
            System.out.println("Uma pessoa entrou! Pessoas no elevador: " + qtdPessoas);
        }
    }

    public void sai(){
        if(qtdPessoas > 0){
            qtdPessoas--;
            System.out.println("Uma pessoa saiu! Pessoas no elevador: " + qtdPessoas);
        }else{
            System.out.println("Elevador está vazio!");
        }
    }

    public void sobe(){
        if(andarAtual == totalAndares){
            System.out.println("O elevador está no último andar!");
        }else{
            andarAtual++;
            System.out.println("Subiu! Andar atual: " + andarAtual);
        }
    }

    public void desce(){
        if(andarAtual == 0){
            System.out.println("O elevador já está no térreo");
        }else{
            andarAtual--;
            System.out.println("Desceu! Andar atual: " + andarAtual);
        }
    }

}
