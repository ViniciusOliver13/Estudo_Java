package Lista_Exercicio.Reuso_De_Classes.Ex61;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Lenovo", "Notebook");
        Computador computador = new Computador("Notebook", "Dell", "Core intel i5", 520);

        System.out.println(equipamento);
        System.out.println(computador);
    }
}
