package Lista_Exercicio.Reuso_De_Classes.Ex63;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, String autor, int anoPublicao){
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicao;
    }

    public String toString(){
        return "Livro: " + nome + "\nAutor: " + autor + "\nAno publicação: " + anoPublicacao;
    }
    
}