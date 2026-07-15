package app;

import enums.StatusMatricula;
import model.Academia;

import java.util.Scanner;

public class MenuAlteracao {
    private Scanner sc = new Scanner(System.in);

    public void menuAlteracao(){
        while (true){
            System.out.println("======");
            System.out.println("Digite 1 para remover um Aluno: ");
            System.out.println("Digite 2 para remover um Instrutor: ");
            System.out.println("Digite 3 para remover um Recepcionista: ");
            System.out.println("Digite 0 para voltar: ");
            System.out.println("======");
            int op = sc.nextInt();
            sc.nextLine();

            if(op == 1){
                Academia.listaAlunos();
                System.out.println("Digite o numero da matricula do Aluno que será removido: ");
                var aux = sc.nextInt();
                sc.nextLine();
                Academia.removeAluno(aux);
            } else if(op == 2){
                Academia.listaInstrutores();
                System.out.println("Digite o numero da matricula do Instrutor que será removido: ");
                var aux = sc.nextInt();
                sc.nextLine();
                Academia.removeInstrutor(aux);
            } else if(op == 3){
                Academia.listaRecepcionistas();
                System.out.println("Digite o numero da matricula do Recepcionista que será removido: ");
                var aux = sc.nextInt();
                sc.nextLine();
                Academia.removeRecepcionista(aux);
            } else if(op == 0){
                return;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}