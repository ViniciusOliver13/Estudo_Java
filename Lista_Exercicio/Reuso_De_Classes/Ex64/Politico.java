package Lista_Exercicio.Reuso_De_Classes.Ex64;

public class Politico extends Pessoa{
    private String nomePartido;

    public Politico(String nome, int idade, String nomePartido){
        super(nome, idade);
        this.nomePartido = nomePartido;
    }

    public String toString(){
        return super.toString() + "\nPartido político: " + nomePartido;
    }
}
