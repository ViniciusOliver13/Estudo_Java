package Lista_Exercicio.Reuso_De_Classes.Ex65;

public class Tecnico extends Assistente{

    public Tecnico(String nome, double salario, int numeroMatricula, double bonusSalarial){
        super(nome, salario, numeroMatricula);
        this.aumentarSalario(bonusSalarial);
    }

    @Override
    public void ganhoAnual(){
        double total = getSalario() * 12.0;
        System.out.printf("Ganho anual R$%.2f + 13º salário R$%.2f = R$%.2f\n", total, getSalario(), total + getSalario());
    }
    
}
