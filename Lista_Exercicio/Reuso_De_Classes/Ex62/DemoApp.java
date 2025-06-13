package Lista_Exercicio.Reuso_De_Classes.Ex62;

public class DemoApp {
    public static void main(String[] args) {
        DataHora dataHora = new DataHora(17, 06, 2025, "20:24");
        EventoDelegacao eventoDelegacao = new EventoDelegacao("São joão", 20, 06, 2025, "22:00");
        EventoHeranca eventoHeranca = new EventoHeranca("São joão da Vila", 21, 06, 2025, "00:00");

        System.out.println(dataHora);
        System.out.println(eventoHeranca);
        System.out.println(eventoDelegacao);
    }
}
