package Lista_Exercicio.Reuso_De_Classes.Ex62;

public class EventoDelegacao {
    private String nome;
    private DataHora dataHora;

    public EventoDelegacao(String nome, int dia, int mes, int ano, String hora){
        this.nome = nome;
        this.dataHora = new DataHora(dia, mes, ano, hora);
    }

    public String toString(){
        return "Nome do evento: " + nome + "\n" + dataHora.toString();
    }
}
