package Lista_Exercicio.Reuso_De_Classes.Ex65;

public class Administrativo extends Assistente{
    private String turno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno){
        super(nome, salario, numeroMatricula);

        if (turno.equals("dia") || turno.equals("Dia")) {
            this.turno = turno;
        }else{
            this.turno = turno;
            this.aumentarSalario(0.20 * salario);
        }
    }

    @Override
    public void ganhoAnual(){
        double total = getSalario() * 12.0;
        double bonusNoturno = (turno.equals("noite")? (0.20 * getSalario()) : 0.0);
        System.out.printf("Ganho anual R$%.2f + 13º salário R$%.2f = R$%.2f\n", total, getSalario() - bonusNoturno, total + getSalario());
    }
    
}
