package Lista_Exercicio.Criacao_Classes.Ex30;

public class Ex30 {
    public static void main(String[] args) {
        Time foguete = new Time("Foguete", 6, 2, 1, 0);

        foguete.empatouJogo();
        foguete.perdeuJogo();
        foguete.perdeuJogo();
        foguete.empatouJogo();
        foguete.ganhouJogo();
        foguete.monstrarTabela();
    }    
}
