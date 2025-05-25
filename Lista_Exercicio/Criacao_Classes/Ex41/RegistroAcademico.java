package Lista_Exercicio.Criacao_Classes.Ex41;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private int codigoCurso;
    private int percentualDeCobranca;
    private static int numeroDeMatriculas;

    public RegistroAcademico(String n, int c, int p){
        this.nome = n;
        this.matricula = ++numeroDeMatriculas;
        this.codigoCurso = c;
        this.percentualDeCobranca = p;    
    }

    double calculaMensalidade(){
        return 100.0 * codigoCurso * (percentualDeCobranca / 100.0);
    }

    public String toString() {
        return "[nome=" + nome + ", matricula=" + matricula + ", codigoCurso=" + codigoCurso
                + ", percentualDeCobranca=" + percentualDeCobranca + "]";
    }
}
