package unidade_1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o grau do polinômio (n)
        System.out.print("Digite o grau do polinômio (n): ");
        int n = scanner.nextInt();

        // Solicita os coeficientes a0, a1, ..., an
        double[] coeficientes = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        // Solicita o valor de x
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        // Calcula e exibe o valor do polinômio
        double resultado = calcularPolinomio(n, coeficientes, x);
        System.out.println("O valor do polinômio P_" + n + "(" + x + ") é: " + resultado);

        scanner.close();
    }

    // Função recursiva para calcular P_n(x)
    public static double calcularPolinomio(int n, double[] coeficientes, double x) {
        // Caso base: P_0(x) = a_n (último coeficiente)
        if (n == 0) {
            return coeficientes[coeficientes.length - 1];
        }
        // Passo recursivo: P_n(x) = x * P_{n-1}(x) + a_{n}
        else {
            return x * calcularPolinomio(n - 1, coeficientes, x) + coeficientes[coeficientes.length - 1 - n];
        }
    }
}
