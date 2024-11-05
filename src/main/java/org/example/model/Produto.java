package org.example;

import java.time.LocalDate;
import java.util.List;

public class Produto {

    private int idProduto;

    private LocalDate dataEmissao;

    private String nome;

    private double preco;

    public Produto(int idproduto, LocalDate dataEmissao, String nome, double preco) {
        this.idProduto = idProduto;
        this.dataEmissao = dataEmissao;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}




