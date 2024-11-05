package org.example;

import org.example.model.Pessoa;

public class Oficina extends Pessoa {
    private String cnpjOficina;

    public Oficina(String nome, String cpf, String email, String endreco, Integer telefone, String cnpjOficina, Integer id) {
        super(nome, cpf, email, endreco, telefone, id);
        this.cnpjOficina = cnpjOficina;
    }

    public String getCnpjOficina() {
        return cnpjOficina;
    }

    public void setCnpjOficina(String cnpjOficina) {
        this.cnpjOficina = cnpjOficina;
    }

    private boolean isCnpjValido(String cnpjOficina){
        return false;
    }

    @Override
    public String mostrarDetalhes() {
        return "CNPJ: " + getCnpjOficina() + "Endereço: " + getEndreco()  + "Email: " + getEmail();

    }
}


