package org.example;

import org.example.model.Pessoa;

public class  Fornecedor extends Pessoa {

    private int idFornecedor;
    private String nomeEmpresa, tempoEntrega, politicaDeDevolucao;

    public Fornecedor(String nome, String cpf, String email, String endreco, Integer telefone, int idFornecedor, String nomeEmpresa, String tempoEntrega, String politicaDeDevolucao) {
        super(nome, cpf, email, endreco, telefone, idFornecedor);
        this.idFornecedor = idFornecedor;
        this.nomeEmpresa = nomeEmpresa;
        this.tempoEntrega = tempoEntrega;
        this.politicaDeDevolucao = politicaDeDevolucao;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(String tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public String getPoliticaDeDevolucao() {
        return politicaDeDevolucao;
    }

    public void setPoliticaDeDevolucao(String politicaDeDevolucao) {
        this.politicaDeDevolucao = politicaDeDevolucao;
    }

    @Override
    public String mostrarDetalhes() {
        return "Nome da empresa: " + getNomeEmpresa() + "Endereço: " + getEndreco() + "Nome do Fornecedor: " + getNome() + "Id Fornecedor: " + getIdFornecedor();

    }
}
