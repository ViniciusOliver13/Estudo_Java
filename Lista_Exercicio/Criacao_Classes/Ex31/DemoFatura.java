package Lista_Exercicio.Criacao_Classes.Ex31;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura fat = new Fatura(22, "null", 44, 100);
        double total = fat.calculaTotal();

        System.out.printf("O valor da fatura é R$%.2f\n", total);
    }
}
