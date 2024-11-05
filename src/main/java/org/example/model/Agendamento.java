package org.example;

import org.example.model.Cliente;

import java.time.LocalDateTime;

public abstract class Agendamento {

    private Cliente cliente;

    private Integer idAgendamento;
    private LocalDateTime dataHora;

    public Agendamento(Cliente cliente, Integer idAgendamento, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.idAgendamento = idAgendamento;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Integer idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public abstract String mostrarDetalhes();
}
