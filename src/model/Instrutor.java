package model;

import interfaces.Pagavel;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Funcionario implements Pagavel {
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private static int cont;
    private int numMatricula;
    private final double SALARIO = 2500;

    public Instrutor(String nome, String cpf, int idade){
        super(nome, cpf, idade);
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
            alunos.remove(aluno);
        }
    }

    @Override
    public double calculaSalario() {
        return (SALARIO + (getAlunos().size() * 50));
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

        return "\nNumero matricula: " + getNumMatricula() + "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nSalário: " + calculaSalario() + "\nQuantidades de alunos: " + qntAlunos;
    }
}
