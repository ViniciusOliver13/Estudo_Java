package Lista_Exercicio.Criacao_Classes.Ex38;

import Lista_Exercicio.Criacao_Classes.Ex37.Contador;

public class Lampada {
    private boolean estadoDaLampada;
    Contador contador = new Contador();

    public void acende(){
        this.estadoDaLampada = true;
        this.contador.encrementar();
    }

    public void apaga(){
        this.estadoDaLampada = false;
    }

    public void mostraEstado(){
        if (estadoDaLampada) {
            System.out.println("A lampada está acesa");
        }else{
            System.out.println("A lampada está apagada");
        }
    }

    public void mostrarContagem(){
        contador.imprimir();
    }

    public boolean estaLigada(){
        if (estadoDaLampada){
            return true;
        }else{
            return false;
        }
    }
}
