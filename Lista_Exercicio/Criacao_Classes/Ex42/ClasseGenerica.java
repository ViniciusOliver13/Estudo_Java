package Lista_Exercicio.Criacao_Classes.Ex42;

public class ClasseGenerica <G> {
    private G primeiro;
    private G segundo;
    private G terceiro;
    
    public ClasseGenerica(G primeiro, G segundo, G terceiro){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }

    public void contarIguais(){
        int cont = 0;
        
       if (primeiro.equals(segundo) && primeiro.equals(terceiro)) {
            cont = 3; 
        } else if (primeiro.equals(segundo) || primeiro.equals(terceiro) || segundo.equals(terceiro)) {
            cont = 2; 
        } else {
            cont = 0; 
        }
        
        System.out.println("Quantidade de atributos iguais: " + cont);
    }
    
    public void imprimir(){
        System.out.println("Primeiro: " + primeiro);
        System.out.println("Segundo: " + segundo);
        System.out.println("Terceiro: " + terceiro);
    }
}   