package Lista_Exercicio.Reuso_De_Classes.Ex63;

public class DemoApp {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Como Programar", "Paul. J Deitel", 2016);
        LivroLivraria livroLivraria= new LivroLivraria("Java Como Programar", "Paul. J Deitel", 2016, 20, 300);
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Java Como Programar", "Paul. J Deitel", 2016, "Minha Biblioteca", 30);

        System.out.println(livro);
        System.out.println(livroLivraria);
        System.out.println(livroBiblioteca);
    }
}
