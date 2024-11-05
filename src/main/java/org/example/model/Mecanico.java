package org.example;

import org.example.model.Pessoa;

public class Mecanico extends Pessoa {

    private String matricula, especializacao, feedbackCliente, disponibilidade;

    public Mecanico(String nome, String cpf, String email, String endreco, Integer telefone, String matricula, String disponibilidade, Integer id) {
        super(nome, cpf, email, endreco, telefone, id);
        this.matricula = matricula;
        this.especializacao = especializacao;
        this.feedbackCliente = feedbackCliente;
        this.disponibilidade = disponibilidade;
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getFeedbackCliente() {
        return feedbackCliente;
    }

    public void setFeedbackCliente(String feedbackCliente) {
        feedbackCliente = feedbackCliente;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String mostrarDetalhes() {
        return "Nome: " + getNome() + "Matricula: " + getMatricula() + "Disponibilidade: " + getDisponibilidade();

    }
}