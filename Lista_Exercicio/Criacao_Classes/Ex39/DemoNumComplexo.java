package Lista_Exercicio.Criacao_Classes.Ex39;

public class DemoNumComplexo {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo();
        NumeroComplexo n2 = new NumeroComplexo(7.4);
        NumeroComplexo n3 = new NumeroComplexo(13.0, 5);
        
        System.out.println("n1 = " + n1.toString());
        System.out.println("n2 = " + n2.toString());
        System.out.println("n3 = " + n3.toString());

    }   
}
