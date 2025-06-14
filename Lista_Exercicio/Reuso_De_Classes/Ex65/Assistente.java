package Lista_Exercicio.Reuso_De_Classes.Ex65;

public class Assistente extends Funcionario{
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula){
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String toString(){
        return super.toString() + "\nNúmero de matrícula: " + numeroMatricula;
    }
    
}
