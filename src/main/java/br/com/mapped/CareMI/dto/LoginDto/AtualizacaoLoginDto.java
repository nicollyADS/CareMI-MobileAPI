package br.com.mapped.CareMI.dto.LoginDto;

import jakarta.validation.constraints.*;

public record AtualizacaoLoginDto(
        @NotBlank(message = "O CPF não pode estar em branco")
        @Size(min = 11, max = 15, message = "O CPF deve ter no máximo 15 caracteres")
        String cpf,

        @NotBlank(message = "A senha não pode estar em branco")
        @Size(max = 100, message = "A senha deve ter no máximo 100 caracteres")
        String senha

) {
}