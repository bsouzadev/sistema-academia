package model;

import enums.StatusMatricula;

public class Aluno extends Pessoa {
    private Instrutor instrutor;
    private static int cont;
    private int numMatricula;
    private StatusMatricula statusMatricula;

    public Aluno(String nome, String cpf, int idade){
        super(nome, cpf, idade);
        cont++;
        numMatricula = cont;
    }

    //
    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public int getNumeroMatricula(){
        return numMatricula;
    }

    public StatusMatricula getStatusMatricula(){
        return statusMatricula;
    }

    public void setStatusMatricula (StatusMatricula matricula){
        statusMatricula = matricula;
    }

    //
    public String toString() { //colocar o status da matrícula do aluno aqui, e arrumar se ele não tiver instrutor...
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nInstrutor: " + getInstrutor().getNome();
    }
}
