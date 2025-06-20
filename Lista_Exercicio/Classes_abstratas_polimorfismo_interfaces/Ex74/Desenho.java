package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex74;

import Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex73.*;

public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private double x1, y1, x2, y2;

    public Desenho (FiguraGeometrica f1, double x1, double y1, FiguraGeometrica f2,double x2, double y2){
        this.figura1 = f1;
        this.figura2 = f2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2; 
    }

    public String apresenta(){
        return "Coordenadas: (" + x1 + ", " + y1 + ") da " + figura1.descricao() + "\n" +
                "Coordenadas: (" + x2 + ", " + y2 + ") da "  + figura2.descricao();
    }
}
