package Lista_Exercicio.Classes_abstratas_polimorfismo_interfaces.Ex75;

public interface ItemDeBiblioteca {
     public int maximoDeDiasParaEmprestimo = 14;

     public boolean estaEmprestado();

     public void empresta();

     public void devolve();

     public String localizacao();
     
     public String descricao();
}
