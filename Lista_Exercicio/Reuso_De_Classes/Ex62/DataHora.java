package Lista_Exercicio.Reuso_De_Classes.Ex62;

public class DataHora {
    private int dia, mes, ano;
    private String hora;

    public DataHora(int dia, int mes, int ano, String hora){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    public String toString(){
        return "Em " + dia + "/" + mes + "/" + ano + "\t" + hora;
    }
}
