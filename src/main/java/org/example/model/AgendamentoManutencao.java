package org.example;

import org.example.model.Agendamento;
import org.example.model.Cliente;
import org.example.model.ManutencaoAutomovel;

import java.time.LocalDateTime;

public class AgendamentoManutencao extends Agendamento {

    private Automovel automovel;
    private ManutencaoAutomovel manutencaoAutomovel;

    public AgendamentoManutencao(Cliente cliente, Integer idAgendamento, LocalDateTime dataHora, Automovel automovel, ManutencaoAutomovel manutencaoAutomovel) {
        super(cliente, idAgendamento, dataHora);
        this.automovel = automovel;
        this.manutencaoAutomovel = manutencaoAutomovel;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public ManutencaoAutomovel getManutencaoAutomovel() {
        return manutencaoAutomovel;
    }

    public void setManutencaoAutomovel(ManutencaoAutomovel manutencaoAutomovel) {
        this.manutencaoAutomovel = manutencaoAutomovel;
    }

    @Override
    public String mostrarDetalhes() {
        return "Agendamento de manutenção " + automovel.getMarcaCarro() + " " + automovel.getModeloCarro() + " " + automovel.getAno() + " " + automovel.getNumeroPlaca() + " para " + getCliente().getNome() + " na data e hora " + getDataHora();

    }
}

