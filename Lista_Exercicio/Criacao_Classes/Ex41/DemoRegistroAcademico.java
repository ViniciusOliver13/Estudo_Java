package Lista_Exercicio.Criacao_Classes.Ex41;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico a1 = new RegistroAcademico("Vinicius", 333, 45);   
        RegistroAcademico a2 = new RegistroAcademico("Bodin", 333, 1);   
        RegistroAcademico a3 = new RegistroAcademico("Foguete", 333, 45);   

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
