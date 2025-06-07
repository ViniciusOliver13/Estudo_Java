package Lista_Exercicio.Arrays_e_ArrayLists.Ex48;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();

        a.novoCompromisso("15h30", "Dormir", 07, 06, 2025);
        a.novoCompromisso("17h00", "Estudar", 07, 06, 2025);
        a.novoCompromisso("09h00", "Meu aniversário", 17, 01, 2025);
        a.novoCompromisso("19h00", "Comer bolo", 17, 01, 2025);

        a.listaDia(17, 01, 2025);
    }
}
