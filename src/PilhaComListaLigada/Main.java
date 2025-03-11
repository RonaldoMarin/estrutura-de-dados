package PilhaComListaLigada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("0 - Encerrar");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");

            int opc = sc.nextInt();

            if (opc == 1){
                System.out.println("Digite o nome do aluno: ");
                String nome = sc.next();
                System.out.println("Digite o idade do aluno: ");
                int idade = sc.nextInt();
                Node no = new Node(nome, idade);
                lista.push(no);
            } else if (opc == 2) {
                Node no = lista.pop();
                if (no == null){
                    System.out.println("Lista ta vazia!");
                }else{
                    System.out.println("Aluno removido com sucesso!\n" + no.getNome() + no.getIdade() + no.getNext().getNome());
                }
            }
        }
    }
}
