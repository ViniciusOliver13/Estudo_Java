package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex74;

import Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex73.*;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        Desenho d1 = new Desenho(circulo, 5.0, 5.0,quadrado, 2, 2);

        FiguraGeometrica t = new Triangulo();
        FiguraGeometrica q = new Quadrado();
        Desenho d2 = new Desenho(t, 10.0, 7.0, q, 4.0, 4.0);

        System.out.println(d1.apresenta() + "\n");
        System.out.println(d2.apresenta());
    }
}
