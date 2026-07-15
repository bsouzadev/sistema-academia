package model;

public class Aluno extends Pessoa {
    private Instrutor instrutor;
    private static int cont;
    private int numMatricula;

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

    //
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nInstrutor: " + getInstrutor().getNome();
    }
}
