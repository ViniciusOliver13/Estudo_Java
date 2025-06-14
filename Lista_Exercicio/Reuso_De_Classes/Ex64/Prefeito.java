package Lista_Exercicio.Reuso_De_Classes.Ex64;

public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, int idade, String nomePartido, String cidade){
        super(nome, idade, nomePartido);
        this.cidade = cidade;
    }

    public String toString(){
        return super.toString() + "\nPrefeito de " + cidade;
    }
}
