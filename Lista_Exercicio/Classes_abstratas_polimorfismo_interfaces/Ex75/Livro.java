package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex75;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro (String titulo, String autor, int numeroDePaginas, int anoDaEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }   

    public String qualTitulo(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    public String toString(){
        return "Livro: " + titulo + "\nAutor: " + autor + "\nAno da edição: " + anoDaEdicao +
            "\nNúmero de páginas: " + numeroDePaginas;
    }
}
