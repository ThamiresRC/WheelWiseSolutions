package org.example;

import org.example.model.Pessoa;

import java.util.Date;

public  class Cliente extends Pessoa {

    private String cnh, rg;
    private Date dataNascimento;

    public Cliente(String nome, String cpf, String email, String endreco, Integer telefone,Integer id) {
        super(nome, cpf, email, endreco, telefone,id);
        this.cnh = cnh;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.id = id;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String mostrarDetalhes() {
        return "Cliente: " + getNome() + "CPF: " + getCpf() + "CNH: " + getCnh() + "Telefone: " + getTelefone();

    }
}





