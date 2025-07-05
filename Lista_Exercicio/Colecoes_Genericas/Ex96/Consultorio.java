package Lista_Exercicio.Colecoes_Genericas.Ex96;

import java.util.LinkedList;
import java.util.Random;

public class Consultorio {
    public static void main(String[] args) {
        LinkedList <Paciente> filaCommum = new LinkedList<>();
        LinkedList <Paciente> filaPrioritaria = new LinkedList<>();
        
        for (int i = 0; i <= 20; i++) {
            Paciente paciente = new Paciente(gerarRG(), gerarIdade());

            if(paciente.getIdade() >= 60) {
                filaPrioritaria.add(paciente);
            } else {
                filaCommum.add(paciente);
            }

            if (!filaPrioritaria.isEmpty()){
                System.out.println("Paciente prioritário: " + filaPrioritaria.poll());
            } else if (!filaCommum.isEmpty()) {
                System.out.println("Paciente comum: " + filaCommum.poll());
            } 
            
        }
    }

    public static int gerarIdade() {
        Random idade = new Random();
        return idade.nextInt(100);
    }

    public static double gerarRG() {
        int min = 1000000;
        int max = 9999999;
        return (int)(Math.random() * (max - min + 1) + min); 
    }
}
