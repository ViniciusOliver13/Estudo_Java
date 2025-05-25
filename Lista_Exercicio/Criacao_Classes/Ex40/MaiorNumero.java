package Lista_Exercicio.Criacao_Classes.Ex40;

public class MaiorNumero {

    public static double maiorDeDois(double n1, double n2) {
        return Math.max(n1, n2);
    }

    public static double maiorDeTres(double n1, double n2, double n3) {
        return Math.max(maiorDeDois(n1, n2), n3);
    }

    public static double maiorDeQuatro(double n1, double n2, double n3, double n4) {
        return Math.max(maiorDeTres(n1, n2, n3), n4);
    }

    public static double maiorDeCinco(double n1, double n2, double n3, double n4, double n5) {
        return Math.max(maiorDeQuatro(n1, n2, n3, n4), n5);
    }

    public static int maiorDeDois(int n1, int n2) {
        return Math.max(n1, n2);
    }

    public static int maiorDeTres(int n1, int n2, int n3) {
        return Math.max(maiorDeDois(n1, n2), n3);
    }

    public static int maiorDeQuatro(int n1, int n2, int n3, int n4) {
        return Math.max(maiorDeTres(n1, n2, n3), n4);
    }

    public static double maiorDeCinco(int n1, int n2, int n3, int n4, int n5) {
        return Math.max(maiorDeQuatro(n1, n2, n3, n4), n5);
    }

}
