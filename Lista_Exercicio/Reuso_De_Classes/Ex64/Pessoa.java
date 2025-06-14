package Lista_Exercicio.Reuso_De_Classes.Ex64;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade;
    }
}
