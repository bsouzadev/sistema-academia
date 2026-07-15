package model;

public abstract class Pessoa {
    private final String cpf;
    private String nome;
    private int idade;

    //
    public Pessoa(String nome, String cpf, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    //
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
