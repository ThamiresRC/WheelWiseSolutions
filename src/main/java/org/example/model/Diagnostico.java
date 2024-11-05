package org.example;

import org.example.model.ManutencaoAutomovel;

import java.util.List;

public class Diagnostico {
    private String tipo, descricao;
    private List<ManutencaoAutomovel> manutencoes;

    public Diagnostico(String tipo, String descricao, List<ManutencaoAutomovel> manutencoes) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.manutencoes = manutencoes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ManutencaoAutomovel> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(List<ManutencaoAutomovel> manutencoes) {
        this.manutencoes = manutencoes;
    }
    public String mostrarDetalhes() {
        return "Diagnostico presente no(a) " + tipo + " " + descricao;


    }

}