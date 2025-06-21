package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex75;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Dom Casmurro","Machado de Assis",256,
            1899, "Prateleira A3", "Romance", false, "Um dos maiores clássicos da literatura brasileira.");

        livro.empresta();
        System.out.println(livro.estaEmprestado() ? "O livro está emprestado." : "O livro está disponível.");
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
        System.out.println(livro.toString());
        livro.devolve();
        System.out.println(livro.estaEmprestado() ? "O livro está emprestado." : "O livro está disponível.");
    }
            
}
