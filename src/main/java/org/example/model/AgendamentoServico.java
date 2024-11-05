package org.example;

import org.example.model.Agendamento;
import org.example.model.Cliente;

import java.time.LocalDateTime;

public class AgendamentoServico extends Agendamento {
    private String tipoServico;
    public AgendamentoServico(Cliente cliente, Integer idAgendamento, LocalDateTime dataHora, String tipoServico) {
        super(cliente, idAgendamento, dataHora);
        this.tipoServico = tipoServico;
    }

    public String getTipoServico() {
        return tipoServico;
    }


    @Override
    public String mostrarDetalhes(){
        return "Agendamento do serviço: " + getTipoServico() + " para " + getCliente().getNome() + " na data e hora " + getDataHora();

    }

}
