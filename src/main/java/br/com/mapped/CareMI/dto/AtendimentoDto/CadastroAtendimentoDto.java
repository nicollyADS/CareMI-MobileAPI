package br.com.mapped.CareMI.dto.AtendimentoDto;
import jakarta.validation.constraints.*;
import lombok.Value;

import java.time.LocalDate;

public record CadastroAtendimentoDto(
        @NotBlank(message = "A descrição não pode estar em branco")
        @Size(max = 500, message = "A descrição deve ter no máximo 500 caracteres")
        String descricao,

        @NotBlank(message = "Os dias não podem ser nulos")
        String dias,

        @NotBlank(message = "O hábito não pode estar em branco")
        @Size(max = 100, message = "O hábito deve ter no máximo 100 caracteres")
        String habito,

        @NotBlank(message = "O tempo de sono não pode estar em branco")
        @Size(max = 10, message = "O tempo de sono deve ter no máximo 10 caracteres")
        String tempoSono,

        @NotBlank(message = "O histórico hereditário não pode estar em branco")
        @Size(max = 50, message = "O histórico hereditário deve ter no máximo 50 caracteres")
        String hereditario,

        @NotBlank(message = "A data de envio não pode ser nula")
        String dataEnvio) {
}
