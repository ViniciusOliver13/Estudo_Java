package Lista_Exercicio.Criacao_Classes.Ex38;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada l = new Lampada();

        l.acende();
        l.acende();
        l.acende();
        l.mostrarContagem();
        l.mostraEstado();
        System.out.println(l.estaLigada());
        l.apaga();
        l.mostrarContagem();
        System.out.println(l.estaLigada());
    }
}
