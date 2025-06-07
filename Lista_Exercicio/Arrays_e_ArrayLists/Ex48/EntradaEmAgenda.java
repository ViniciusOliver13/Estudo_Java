package Lista_Exercicio.Arrays_e_ArrayLists.Ex48;

public class EntradaEmAgenda {
    private String hora, assunto;
    private int ano, mes, dia;

    public EntradaEmAgenda(String hora, String assunto, int dia, int mes, int ano){
        this.hora = hora;
        this.assunto = assunto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        if ((this.dia == dia) && (this.mes == mes) && (this.ano == ano)) {
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String res = "";
        res += ("Agenda do dia " + dia + "/" + mes + "/" + ano + "\n");
        res += ("Assunto: " + assunto + "\n");
        res += ("Hora: " + hora + "\n");

        return res;
    }
}   