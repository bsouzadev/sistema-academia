package app;

import model.Academia;
import model.Aluno;
import model.Instrutor;
import model.Recepcionista;

import java.util.Scanner;

public class MenuCadastro {
    private Academia academia = new Academia();
    private Scanner sc = new Scanner(System.in);

    public void menuCadastro(){
        while (true){
            System.out.println("=== Cadastro ===");
            System.out.println("Digite 1 para Cadastrar um Aluno");
            System.out.println("Digite 2 para Cadastrar um Instrutor");
            System.out.println("Digite 3 para Cadastrar um Recepcionista");
            System.out.println("Digite 0 para voltar");
            System.out.println("=====");
            int op = sc.nextInt();
            sc.nextLine();

            if(op == 1){
                System.out.println("Digite seu nome: ");
                String nomeAluno = sc.nextLine();
                System.out.println("Digite o seu CPF: ");
                String cpfAluno = sc.nextLine();
                System.out.println("Digite a sua idade: ");
                int idadeAluno = sc.nextInt();
                System.out.println("Deseja vincular esse aluno a um instrutor? (1 - Sim / 0 - Não)");
                int opInstrutor = sc.nextInt();
                sc.nextLine();
                Aluno aluno = new Aluno(nomeAluno, cpfAluno, idadeAluno);
                if (opInstrutor == 0){
                    Academia.matriculaAluno(aluno);
                } else {
                    if(Academia.listaInstrutores()){
                        System.out.println("Digite o numero do instrutor: ");
                        var aux = sc.nextInt();
                        sc.nextLine();
                        Academia.matriculaAluno(aluno);
                        aluno.setInstrutor(academia.getInstrutor(aux));
                    } else {
                        Academia.matriculaAluno(aluno);
                    }
                }


            } else if(op == 2){
                System.out.println("Digite o nome do instrutor: ");
                String nomeInstrutor = sc.nextLine();
                System.out.println("Digite o seu CPF: ");
                String cpfInstrutor = sc.nextLine();
                System.out.println("Digite a sua Idade: ");
                int idadeInstrutor = sc.nextInt();
                System.out.println("Digite o seu Salario: ");
                double salarioInstrutor = sc.nextDouble();
                Instrutor instrutor = new Instrutor(nomeInstrutor, cpfInstrutor, idadeInstrutor, salarioInstrutor);
                Academia.matriculaInstrutor(instrutor);

            } else if (op == 3) {
                System.out.println("Digite o nome do Recepcionista: ");
                String nomeRecepcionista = sc.nextLine();
                System.out.println("Digite o seu CPF: ");
                String cpfRecepcionista = sc.nextLine();
                System.out.println("Digite a sua Idade: ");
                int idadeRecepcionista = sc.nextInt();
                System.out.println("Digite o seu Salario: ");
                double salarioRecepcionista = sc.nextDouble();
                Recepcionista recepcionista = new Recepcionista(nomeRecepcionista, cpfRecepcionista, idadeRecepcionista, salarioRecepcionista);
                Academia.matriculaRecepcionista(recepcionista);

            } else {
                sc.close();
                return;
            }
        }
    }
}