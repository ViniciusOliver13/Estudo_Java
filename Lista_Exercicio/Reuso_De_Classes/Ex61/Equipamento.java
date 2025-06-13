package Lista_Exercicio.Reuso_De_Classes.Ex61;

public class Equipamento {
    private String marca;
    private String nome;

    public Equipamento(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "nome: " + nome + "\nmarca: " + marca;
    }
    
}
