package Lista_Exercicio.Reuso_De_Classes.Ex64;

public class DemoApp {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        Politico politico = new Politico("Ana", 40, "Partido X");
        Prefeito prefeito = new Prefeito("Maria", 45, "Partido A", "São Paulo");
        Governador governador = new Governador("Carlos", 50, "Partido B", "Rio Grande do Sul");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
