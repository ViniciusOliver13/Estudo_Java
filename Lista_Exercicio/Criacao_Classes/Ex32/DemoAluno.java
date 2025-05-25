package Lista_Exercicio.Criacao_Classes.Ex32;

public class DemoAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(878567, "Kayque", 10, 10, 10);
        Aluno a2 = new Aluno(12222, "Bodin", 5, 8, 9);

        a1.imprimirDados();
        a2.imprimirDados();
    }
}
