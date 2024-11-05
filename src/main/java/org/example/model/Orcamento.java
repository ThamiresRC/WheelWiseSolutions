package org.example;

import org.example.model.Cliente;
import org.example.model.Mecanico;
import org.example.model.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private int idOrcamento;

    private LocalDate dataEmissao;

    private Cliente cliente;

    private Mecanico mecanico;

    private List<ManutencaoAutomovel> servicos;

    private List<Produto> produtos;

    private double custoTotal;

    //Lista para verificacao
    private List<Produto> produtosDisponiveis;

    public Orcamento(int idOrcamento, LocalDate dataEmissao, Cliente cliente, Mecanico mecanico) {
        this.idOrcamento = idOrcamento;
        this.dataEmissao = dataEmissao;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.servicos = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.custoTotal = 0.0;
        this.produtosDisponiveis = new ArrayList<>();
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public List<ManutencaoAutomovel> getServicos() {
        return servicos;
    }

    // Método para adicionar um serviço de manutenção ao orçamento
    public void adicionarServico(ManutencaoAutomovel servico) {
        servicos.add(servico);
        custoTotal += servico.getCusto();
    }
    public List<Produto> getProdutos() {
        return produtos;
    }

    //Metodo para adicionar um produto com verificacao de disponibilidade
    public boolean adicionarProduto(Produto produto) {
        if (produtosDisponiveis.contains(produto)) {
            produtos.add(produto);
            custoTotal += produto.getPreco();
            return true;
        } else {
            System.out.println("Produto não disponível: " + produto.getNome());
            return false;
        }
    }

    public void setProdutosDisponiveis(List<Produto> produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    //Reinicia o custo total e recalcula com base em servicos e produtos
    public void calcularCustoTotal() {
        custoTotal = 0.0;
        for (ManutencaoAutomovel servico : servicos) {
            custoTotal += servico.getCusto();
        }
        for (Produto produto : produtos) {
            custoTotal += produto.getPreco();
        }
    }
    public String mostrarDetalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Ordem do serviço: ").append(getIdOrcamento()).append("\n")
                .append("Data: ").append(getDataEmissao()).append("\n")
                .append("Orçamento para: ").append(cliente.getNome()).append("\n")
                .append("Mecanico responsável: ").append(mecanico.getNome()).append("\n");

        if (!produtos.isEmpty()) {
            detalhes.append("Produtos necessários: \n");
            for (Produto produto : produtos) {
                detalhes.append("- ").append(produto.getNome()).append("\n");
            }
        } else {
            detalhes.append("Nenhum produto adicionado.\n");
        }

        if (!servicos.isEmpty()) {
            detalhes.append("Serviços que serão realizados: \n");
            for (ManutencaoAutomovel servico : servicos) {
                detalhes.append("- ").append(servico.getDescricao()).append("\n");
            }
        } else {
            detalhes.append("Nenhum serviço adicionado.\n");
        }

        detalhes.append("Total: R$").append(getCustoTotal()).append("\n");

        return detalhes.toString();
    }
}

