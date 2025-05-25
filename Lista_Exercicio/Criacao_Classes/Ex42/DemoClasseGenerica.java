package Lista_Exercicio.Criacao_Classes.Ex42;

public class DemoClasseGenerica {
    public static void main(String[] args) {
        ClasseGenerica <String> g1 = new ClasseGenerica<>("Vinicius", "Bodin", "Bodin");
        ClasseGenerica <Integer> g2 = new ClasseGenerica<>(1, 2, 3);
        
        g1.contarIguais();
        g2.contarIguais();
    }
}
