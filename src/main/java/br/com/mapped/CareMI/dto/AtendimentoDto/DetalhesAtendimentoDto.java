package br.com.mapped.CareMI.dto.AtendimentoDto;
import br.com.mapped.CareMI.model.Atendimento;

import java.time.LocalDate;

public record DetalhesAtendimentoDto(Long id, String descricao, String dias, String habito, String tempoSono, String hereditario, String dataEnvio) {

    public DetalhesAtendimentoDto(Atendimento atendimento) {
        this(atendimento.getId(), atendimento.getDescricao(), atendimento.getDias(), atendimento.getHabito(), atendimento.getTempoSono(), atendimento.getHereditario(), atendimento.getDataEnvio());
    }
}
