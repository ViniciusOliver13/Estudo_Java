package Lista_Exercicio.Criacao_Classes.Ex31;

public class Fatura {
    int idNumero;
    String descricao;
    int quantidade;
    double preco;

    Fatura(int idNumero, String descricao, int quantidade, double preco){
        this.idNumero = idNumero;
        this.descricao = descricao;
        this.quantidade = (quantidade >= 0 ? quantidade : 0);
        this.preco = (preco >= 0.0 ? preco : 0.0);
    }

    double calculaTotal(){
        return (double) this.preco * this.quantidade;
    }    
}
