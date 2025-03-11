package HashTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho do HashTable: ");
        int tamanho = sc.nextInt();

        Hash th = new Hash(tamanho);


        while (true){
            System.out.print("Escolha uma opcao: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Remover");
            System.out.println("4 - Printar");

            int opcao = sc.nextInt();

            if (opcao == 0){
                break;
            } else if (opcao == 1) {

            }

        }
    }
}
