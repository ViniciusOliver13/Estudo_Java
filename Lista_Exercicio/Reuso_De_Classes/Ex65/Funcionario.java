package Lista_Exercicio.Reuso_De_Classes.Ex65;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double valorAumento){
        salario += valorAumento;
    }

    public void ganhoAnual(){
        double total = salario * 12.0;
        System.out.printf("Ganho anual R$%.2f + 13º salário R$%.2f = R$%.2f\n", total, salario, total + salario);
    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        return String.format("Nome: %s\nSalário: %.2f", nome, salario); 
    }
    
}