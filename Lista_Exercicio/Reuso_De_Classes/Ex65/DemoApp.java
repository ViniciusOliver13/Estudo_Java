package Lista_Exercicio.Reuso_De_Classes.Ex65;

public class DemoApp {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Carlos", 5000.00, 1234);
        Funcionario funcionario = new Funcionario("João", 3000.00);
        Tecnico tecnico = new Tecnico("Maria", 3500.00, 12345, 500.00);
        Administrativo administrativo = new Administrativo("Ana", 4000.00, 67890, "noite");
        
        System.out.println(assistente);
        assistente.ganhoAnual();
        System.out.println("\n" + funcionario);
        funcionario.ganhoAnual();
        System.out.println("\n" + tecnico);
        tecnico.ganhoAnual();
        System.out.println("\n" + administrativo);
        administrativo.ganhoAnual();
    }
}
