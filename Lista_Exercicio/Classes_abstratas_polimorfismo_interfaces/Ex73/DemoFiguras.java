package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex73;

public class DemoFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Triangulo t = new Triangulo();
        Quadrado q = new Quadrado();

        System.out.println(c.descricao());
        System.out.println(t.descricao());
        System.out.println(q.descricao());
    }
}
