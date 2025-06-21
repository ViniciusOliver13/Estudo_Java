package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex75;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private String localizacao;
    private String genero;
    private String descricao;
    private boolean estaEmprestado;

    public LivroDeBiblioteca (String titulo, String autor, int numeroDePaginas, int anoDaEdicao, 
                            String localizacao, String genero, boolean estaEmprestado, String descricao){

        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.genero = genero;
        this.estaEmprestado = estaEmprestado;
        this.descricao = descricao;
    }

    public boolean estaEmprestado(){
        if (estaEmprestado){
            return true;
        }else{
            return false;
        }
    }

    public void empresta(){
        estaEmprestado = true;
    }

    public void devolve(){
        estaEmprestado = false;
    }

    public String localizacao(){
        return genero + ": " + localizacao;
    }

    public String descricao(){
        return genero + ": " + descricao;
    }

    public String toString(){
        return super.toString() + "\nLocalização: " + localizacao + "\nGênero: " + genero +
            "\nDescrição: " + descricao + "\nEstá emprestado? " + (estaEmprestado ? "Sim" : "Não");
    }
}
