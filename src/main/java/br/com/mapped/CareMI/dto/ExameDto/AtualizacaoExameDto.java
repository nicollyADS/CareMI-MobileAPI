package br.com.mapped.CareMI.dto.ExameDto;

import jakarta.validation.constraints.*;

public record AtualizacaoExameDto(
        @NotBlank(message = "A data não pode estar em branco")
        String data,

        @NotBlank(message = "A hora não pode estar em branco")
        String hora,

        @NotBlank(message = "A descrição não pode estar em branco")
        @Size(max = 500, message = "A descrição deve ter no máximo 500 caracteres")
        String descricao
) {
}