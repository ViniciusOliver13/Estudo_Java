package Lista_Exercicio.Arrays_e_ArrayLists.Ex48;

import java.util.ArrayList;

public class Agenda {
    private ArrayList <EntradaEmAgenda> agenda;
    
    public Agenda(){
        this.agenda = new ArrayList<>();
    }

    public void novoCompromisso(String hora, String assunto, int dia, int mes, int ano){
        EntradaEmAgenda novo = new EntradaEmAgenda(hora, assunto, dia, mes, ano);
        this.agenda.add(novo);
    }

    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda lista : agenda) {
            if (lista.ehNoDia(dia, mes, ano)){
                System.out.println(lista.toString());
            }
        }
    }

    public String toString(){
        String res = "";

        for (EntradaEmAgenda lista : agenda) {
            res += lista.toString() + "\n";
        }

        return res;
    }
}
