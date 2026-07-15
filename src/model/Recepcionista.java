package model;

public class Recepcionista extends Funcionario {
    private static int cont;
    private int numMatricula;

    public Recepcionista(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario);
        cont++;
        numMatricula = cont;
    }

    //
    public int getNumMatricula(){
        return numMatricula;
    }
    //
    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nSalário: " + getSalario();
    }
}
