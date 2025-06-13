package Lista_Exercicio.Reuso_De_Classes.Ex61;

public class Computador extends Equipamento {
    private String processador;
    private int capacidadeMemoria;

    public Computador(String nome, String marca, String processador, int capacidadeMemoria){
        super(marca, nome);
        this.processador = processador;
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public void setCapacidadeMemoria(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }
    
    public int getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public String toString(){
        return super.toString() + "\nprocessador: " + processador + "\ncapacidade de memória: " + capacidadeMemoria;
    }

}
