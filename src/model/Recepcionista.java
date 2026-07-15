package model;

import interfaces.Pagavel;

public class Recepcionista extends Funcionario implements Pagavel {
    private static int cont;
    private int numMatricula;
    private final double SALARIO = 1621;

    public Recepcionista(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        cont++;
        numMatricula = cont;
    }

    @Override
    public double calculaSalario() {
        return SALARIO;
    }

    //
    public int getNumMatricula(){
        return numMatricula;
    }
    //
    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nSalário: " + calculaSalario();
    }
}
