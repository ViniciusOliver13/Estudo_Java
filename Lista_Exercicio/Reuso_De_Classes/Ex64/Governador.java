package Lista_Exercicio.Reuso_De_Classes.Ex64;

public class Governador extends Politico{
    private String estado;

    public Governador(String nome, int idade, String nomePartido, String estado){
        super(nome, idade, nomePartido);
        this.estado = estado;
    }

    public String toString(){
        return super.toString() + "\nGovernador do " + estado;
    }
}
