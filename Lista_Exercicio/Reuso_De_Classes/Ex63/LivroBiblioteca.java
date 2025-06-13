package Lista_Exercicio.Reuso_De_Classes.Ex63;

public class LivroBiblioteca extends Livro{
    private String nomeBiblioteca;
    private int quantidade;

    public LivroBiblioteca(String nome, String autor, int anoPublicao, String nomeBiblioteca, int quantidade){
        super(nome, autor, anoPublicao);
        this.nomeBiblioteca = nomeBiblioteca;
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Nome da biblioteca: " + nomeBiblioteca + "\n" + super.toString() + "\nUnidades disponíveis: " + quantidade;
    }
}
