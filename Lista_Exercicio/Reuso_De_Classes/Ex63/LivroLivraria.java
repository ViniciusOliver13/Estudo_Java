package Lista_Exercicio.Reuso_De_Classes.Ex63;

public class LivroLivraria extends Livro{
    private int quantidade;
    private double preco;

    public LivroLivraria(String nome, String autor, int anoPublicao, int quantidade, double preco){
        super(nome, autor, anoPublicao);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String toString(){
        return super.toString() + "\nPreço: R$" + preco + "\nUnidades disponíveis: " + quantidade;
    }

}
