package Lista_Exercicio.Arrays_e_ArrayLists.Ex50;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList <Cliente> clientes = new ArrayList<>();
        Scanner l = new Scanner(System.in);
        
        while (true) {
            Cliente novoCliente = new Cliente();

            System.out.println("Digite o id: ");
            novoCliente.id = l.nextInt();
            
            if (novoCliente.id < 0){
                break;
            }
            
            System.out.println("Digite o nome: ");
            novoCliente.nome = l.next();
            
            System.out.println("Digite a idade");
            novoCliente.idade = l.nextInt();
            
            System.out.println("Digite o telefone");
            novoCliente.telefone = l.next();
            
            System.out.println("------------------------");
            clientes.add(novoCliente);
        }
        
        l.close();

        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
            System.out.println("------------------------");
        }
    }
}
