package Construtores;
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //metodo construtor
    //colocar os atributos relevantes para a existência do projeto
    //nome deve ser igual ao da classe
    //significa que cada vez que criar uma nova pessoa, automaticamente deverá pedir nome e cpf
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    // ...
    // setters de nome e cpf ?
}