package com.example.orientacao.objetos.exercicios.exercicio1;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    private Integer idade;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String nome(){
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
