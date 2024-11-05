package org.example;

public class ManutencaoAutomovel {

    private String descricao;
    private double custo;

    public ManutencaoAutomovel(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    //Metodo para exibir detalhes de manutencao
    public String exibirDetalhes() {
        return "Serviço: " + descricao + "\nCusto: R$" + String.format("%.2f", custo);
    }

    @Override
    public String toString() {
        return descricao + " valor da manutenção R$" + String.format("%.2f", custo);
    }
}
