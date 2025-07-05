package Lista_Exercicio.Colecoes_Genericas.Ex96;

public class Paciente {
    private double rg;
    private int idade;

    public Paciente(double rg, int idade){
        this.rg = rg;
        this.idade = idade;
    }

    public double getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "RG: " + rg + "\nIdade: " + idade;
    }
}
