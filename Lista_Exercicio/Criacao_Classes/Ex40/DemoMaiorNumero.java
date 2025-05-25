package Lista_Exercicio.Criacao_Classes.Ex40;

public class DemoMaiorNumero {
    public static void main(String[] args) {
        System.out.println(MaiorNumero.maiorDeDois(10.7, 5.3));
        System.out.println(MaiorNumero.maiorDeTres(10.2, 5.6, 20.2));
        System.out.println(MaiorNumero.maiorDeQuatro(10.2, 5.5, 33.3, 12.9));
        System.out.println(MaiorNumero.maiorDeCinco(10.1, 5.7, 44.3, 86.2,100.3));

        System.out.println(MaiorNumero.maiorDeDois(10, 5));
        System.out.println(MaiorNumero.maiorDeTres(10, 5, 20));
        System.out.println(MaiorNumero.maiorDeQuatro(10, 5, 33, 12));
        System.out.println(MaiorNumero.maiorDeCinco(10, 5, 44, 8,100));
    }
}
