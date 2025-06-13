package Lista_Exercicio.Reuso_De_Classes.Ex62;

public class EventoHeranca extends DataHora{
    private String nome;

    public EventoHeranca(String nome, int dia, int mes, int ano, String hora){
        super(dia, mes, ano, hora);
        this.nome = nome;
    }

    public String toString(){
        return "Nome do evento: " + nome + "\n" + super.toString();
    }
}
