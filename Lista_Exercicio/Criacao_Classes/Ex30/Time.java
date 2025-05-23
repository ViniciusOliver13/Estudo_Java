package Lista_Exercicio.Criacao_Classes.Ex30;

public class Time {
    String nome;
    int vitorias;
    int derrotas;
    int empates;
    int pontos;

    Time(String nome, int vitorias, int derrotas, int empates, int pontos){
        this.nome = (nome.isEmpty()? "Indefinido" : nome);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.pontos = pontos;
        monstrarTabela();
    }

    void monstrarTabela(){
        System.out.println("=======================================================");
        System.out.printf("%s | %d Vitórias | %d Derrotas | %d Empates | %d Pontos|\n", nome, vitorias, derrotas, empates, pontos);
        System.out.println("=======================================================");
    }

    void ganhouJogo(){
        System.out.println("O time " + this.nome + " ganhou um jogo!");
        this.vitorias += 1;
        this.pontos += 3;
    }

    void perdeuJogo(){
        System.out.println("O time " + this.nome + " perdeu um jogo!");
        this.derrotas += 1;
        this.pontos += (pontos > 0 ? -1 : 0);
    }

    void empatouJogo(){
        System.out.println("O time " + this.nome + " empatou um jogo!");
        this.empates += 1;
        this.pontos += 1;
    }

}
