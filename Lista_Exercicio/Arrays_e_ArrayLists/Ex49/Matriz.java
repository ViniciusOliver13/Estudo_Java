package Lista_Exercicio.Arrays_e_ArrayLists.Ex49;

public class Matriz {
    private float matriz[][] = new float[2][2];

    public Matriz(int a11, int a12, int a21, int a22) {
        matriz[0][0] = a11;
        matriz[0][1] = a12;
        matriz[1][0] = a21;
        matriz[1][1] = a22;
    }

    public void determinante(){
        float determinante;
        determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        System.out.println("O determinante da matriz é " + determinante);
    }

    public void imprimir(){
        for (float linhas[] : matriz) {
            for (float colunas : linhas) {
                System.out.print(colunas + " ");
            }
            System.out.println();
        }
    }

}
