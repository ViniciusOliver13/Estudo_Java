package Lista_Exercicio.Criacao_Classes.Ex32;

public class Aluno {
    int matricula;
    String nome;
    double p1, p2, trabalho;

    public Aluno(int matricula, String nome, double p1, double p2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    double media(){
        return (2.5 * p1 + 2.5 * p2 + 2 * trabalho) / 7.0;
    }

    double provaFinal(){
        double mp = media();

        if (mp < 3.0 || mp >= 7.0) {
            return 0.0;

        }else {
            return (50 - mp * 6) / 4.0;
        }
    }

    void imprimirDados(){
        System.out.println("Aluno: " + nome);
        System.out.printf("Média Parcial: %.2f\n", media());
        
        if (media() < 3.0 || media() >= 7.0){
            System.out.println("Esse aluno não precisa fazer o exame final\n");
        }else{
            System.out.printf("Esse aluno precisa de %.2f no exame final para ser aprovado\n\n", provaFinal());
        }
    }
}
