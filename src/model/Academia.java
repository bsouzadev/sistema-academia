package model;

import enums.StatusMatricula;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private static List<Aluno> alunosMatriculados = new ArrayList<Aluno>();
    private static List<Instrutor> instrutoresMatriculados = new ArrayList<Instrutor>();
    private static List<Recepcionista> recepcionistasMatriculados = new ArrayList<Recepcionista>();

    //
    public static void matriculaAluno(Aluno aluno){
        alunosMatriculados.add(aluno);
        statusDaMatriculaAluno(aluno.getNumeroMatricula(), StatusMatricula.ATIVO);
        System.out.println("Aluno " + aluno.getNome() + " matriculado!");
    }

    public static void numeroTotalDeAlunos(){
        if(alunosMatriculados == null || alunosMatriculados.isEmpty()){
            System.out.println("\nA academia não possui Alunos cadastrados!");
            return;
        }

        System.out.println("\nTotal de Alunos matriculados: " + alunosMatriculados.size());
    }

    public static void listaAlunos(){
        if(alunosMatriculados == null || alunosMatriculados.isEmpty()){
            System.out.println("A academia não possui Alunos cadastrados!");
            return;
        }

        for (int i =0; i < alunosMatriculados.size(); i++){
            System.out.println(alunosMatriculados.get(i).getNumeroMatricula() + " " + alunosMatriculados.get(i).getNome());
        }

        numeroTotalDeAlunos();
    }

    public static Aluno verificaAlunoMatriculado (int matricula){ //procurar um aluno
        if(alunosMatriculados == null || alunosMatriculados.isEmpty()){
            System.out.println("Aluno não encontrado!");
            return null;
        }

        for (int i =0; i < alunosMatriculados.size(); i++){
            if (alunosMatriculados.get(i).getNumeroMatricula() == matricula){
                return alunosMatriculados.get(i);
            }
        }

        System.out.println("Aluno não encontrado!");
        return null;
    }

    public static void removeAluno(int matricula){
        Aluno aluno1 = verificaAlunoMatriculado(matricula);

        if (aluno1 == null) return;

        System.out.println("Aluno removido da academia!");
        alunosMatriculados.remove(aluno1);

        statusDaMatriculaAluno(matricula, StatusMatricula.INATIVO);
    }

    public static void statusDaMatriculaAluno(int matricula, StatusMatricula statusMatricula){
        if(statusMatricula == StatusMatricula.ATIVO){
            alunosMatriculados.get(matricula).setStatusMatricula(statusMatricula);

        } else if(statusMatricula == StatusMatricula.SUSPENSO){
            alunosMatriculados.get(matricula).setStatusMatricula(statusMatricula);

        } else{
            alunosMatriculados.get(matricula).setStatusMatricula(statusMatricula);
        }
    }

    //
    public static void numeroTotalDeInstrutores(){
        if(instrutoresMatriculados == null || instrutoresMatriculados.isEmpty()){
            System.out.println("\nA academia não possui Instrutores cadastrados!");
            return;
        }

        System.out.println("\nTotal de Instrutores matriculados: " + instrutoresMatriculados.size());
    }

    public static void matriculaInstrutor(Instrutor instrutor){
        instrutoresMatriculados.add(instrutor);
        System.out.println("Instrutor " + instrutor.getNome() + " matriculado!");
    }

    public static boolean listaInstrutores(){
        if(instrutoresMatriculados == null || instrutoresMatriculados.isEmpty()){
            System.out.println("A academia não possui instrutores cadastrados!");
            return false;
        }

        System.out.println("Instrutores disponíveis: ");
        for (int i =0; i < instrutoresMatriculados.size(); i++){
            System.out.println(instrutoresMatriculados.get(i).getNumMatricula() + " " + instrutoresMatriculados.get(i).getNome());
        }

        numeroTotalDeInstrutores();
        return true;
    }

    public static void removeInstrutor(int matricula){
        Instrutor instrutor1 = verificaInstrutorMatriculado(matricula);

        if (instrutor1 == null) return;

        System.out.println("Instrutor removido da academia!");
        instrutoresMatriculados.remove(instrutor1);
    }

    public static Instrutor verificaInstrutorMatriculado (int matricula){ //procurar um instrutor
        if(instrutoresMatriculados == null || instrutoresMatriculados.isEmpty()){
            System.out.println("Instrutor não encontrado!");
            return null;
        }

        for (int i =0; i < instrutoresMatriculados.size(); i++){
            if (instrutoresMatriculados.get(i).getNumMatricula() == matricula){
                return instrutoresMatriculados.get(i);
            }
        }

        System.out.println("Instrutor não encontrado!");
        return null;
    }

    public Instrutor getInstrutor(int matricula){
        for (int i =0; i< instrutoresMatriculados.size(); i++){
            if (instrutoresMatriculados.get(i).getNumMatricula() == matricula){
                return instrutoresMatriculados.get(i);
            }
        }

        return null;
    }

    //
    public static void numeroTotalDeRecepcionistas(){
        if(recepcionistasMatriculados == null || recepcionistasMatriculados.isEmpty()){
            System.out.println("\nA academia não possui Recepcionistas cadastrados!");
            return;
        }

        System.out.println("\nTotal de Recepcionistas matriculados: " + recepcionistasMatriculados.size());
    }

    public static void matriculaRecepcionista(Recepcionista recepcionista){
        recepcionistasMatriculados.add(recepcionista);
        System.out.println("Recepcionista " + recepcionista.getNome() + " matriculado!");
    }

    public static void listaRecepcionistas(){
        if(recepcionistasMatriculados == null || recepcionistasMatriculados.isEmpty()){
            System.out.println("A academia não possui recepcionistas cadastrados!");
            return;
        }

        for (int i =0; i < recepcionistasMatriculados.size(); i++){
            System.out.println(i+1 + " " + recepcionistasMatriculados.get(i).getNome());
        }

        numeroTotalDeRecepcionistas();
    }

    public static void removeRecepcionista(int matricula){
        Recepcionista recepcionista1 = verificaRecepcionistaMatriculado(matricula);

        if (recepcionista1 == null) return;

        System.out.println("Recepcionista removido da academia!");
        recepcionistasMatriculados.remove(recepcionista1);
    }

    public static Recepcionista verificaRecepcionistaMatriculado (int matricula){ //procurar um recepcionista
        if(recepcionistasMatriculados == null || recepcionistasMatriculados.isEmpty()){
            System.out.println("Recepcionista não encontrado!");
            return null;
        }

        for (int i =0; i < recepcionistasMatriculados.size(); i++){
            if (recepcionistasMatriculados.get(i).getNumMatricula() == matricula){
                return recepcionistasMatriculados.get(i);
            }
        }

        System.out.println("Recepcionista não encontrado!");
        return null;
    }
}