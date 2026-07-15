package app;

import model.Academia;

import java.util.Scanner;

public class MenuRelatorio {
    private Scanner sc = new Scanner(System.in);

    public void menuRelatorio(){
        while (true){
            System.out.println("=== Relatório da Academia ===");
            System.out.println("Digite 1 para visualizar total de alunos matriculados: ");
            System.out.println("Digite 2 para visualizar total de instrutores matriculados: ");
            System.out.println("Digite 3 para visualizar total de recepcionistas matriculados: ");
            System.out.println("Digite 0 para voltar: ");
            System.out.println("======");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1){
                Academia.listaAlunos();
            } else if (op == 2) {
                Academia.listaInstrutores();
            } else if (op == 3) {
                Academia.listaRecepcionistas();
            } else if (op == 0){
                return;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
