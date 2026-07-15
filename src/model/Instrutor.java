package model;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Funcionario {
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private static int cont;
    private int numMatricula;

    public Instrutor(String nome, String cpf, int idade, double salario){
        super(nome, cpf, idade, salario);
        cont ++;
        numMatricula = cont;
    }

    //
    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listaAlunos(){
        if(alunos.isEmpty()){
            System.out.println("O instrutor " + this.getNome() + ", não possui alunos!");
            return;
        }

        System.out.println("Alunos do instrutor " + this.getNome());
        for (int i =0; i < alunos.size(); i++){
            System.out.println("Numero matricula: " + alunos.get(i).getNumeroMatricula() + ": " + alunos.get(i).getNome());
        }
    }

    public Aluno buscaAluno(int matricula){
        for (int i =0; i<alunos.size(); i++){
            if(alunos.get(i).getNumeroMatricula() == matricula){
                return alunos.get(i);
            }
        }

        System.out.println("Aluno não cadastrado!");
        return null;
    }

    public void modificaAluno(int matricula, String nome){
         Aluno aluno = this.buscaAluno(matricula);

         if(aluno != null){
             aluno.setNome(nome);
             System.out.println("Nome alterado com sucesso!");
         }
    }

    public void removeAluno (int matricula){
        Aluno aluno = this.buscaAluno(matricula);

        if(aluno != null){
            alunos.remove(matricula);
        }
    }

    //
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public int numDeAlunos(){
        return alunos.size();
    }

    public int getNumMatricula(){
        return numMatricula;
    }

    //
    public String toString(){
        int qntAlunos = alunos.size();

        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nSalário: " + getSalario() + "\nQuantidades de alunos: " + qntAlunos;
    }
}
