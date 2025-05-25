package Lista_Exercicio.Criacao_Classes.Ex39;

public class NumeroComplexo {
    double parteReal;
    double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplexo(double parteReal){
        this.parteReal = parteReal;
        this.parteImaginaria = 0.0;
    }

    public NumeroComplexo(){
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    public String toString(){
        return (parteReal + " + " + parteImaginaria + "i");
    }

}
