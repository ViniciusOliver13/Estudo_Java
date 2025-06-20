package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex72;

public class Funcionario {
    private String nome;
    private int id;
    private float salarioPorHora;

    public Funcionario (String nome, int id, float salarioPorHora){
        this.nome = nome;
        this.id = id;
        this.salarioPorHora = salarioPorHora;
    }

    public Funcionario (String nome){
        this.nome = nome;
        this.salarioPorHora = 2.0f;
    }

    public float calcularSalario(int horasTrabalhadas){
        return salarioPorHora * horasTrabalhadas;
    }

    public String toString(){
        return "Funcionario ID: " + id + "\nNome: " + nome + "\nSalário por hora: " + salarioPorHora;
    }
}
