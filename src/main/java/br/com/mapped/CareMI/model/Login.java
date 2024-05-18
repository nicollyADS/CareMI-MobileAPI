package br.com.mapped.CareMI.model;

import br.com.mapped.CareMI.dto.LoginDto.AtualizacaoLoginDto;
import br.com.mapped.CareMI.dto.LoginDto.CadastroLoginDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="login")
@EntityListeners(AuditingEntityListener.class)
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login")
    @SequenceGenerator(name = "login", sequenceName = "seq_mobile_login", allocationSize = 1)
    @Column(name="cdLogin", length = 9)
    private Long id;

    @Column(name="nrCpf", length = 15, nullable = false)
    private String cpf;

    @Column(name="dsSenha", length = 100, nullable = false)
    private String senha;


    public Login(CadastroLoginDto loginDto) {
        cpf = loginDto.cpf();
        senha = loginDto.senha();
    }

    public void atualizarInformacoesLogin(AtualizacaoLoginDto dto) {
        if (dto.cpf() != null)
            cpf = dto.cpf();
        if (dto.senha() != null)
            senha = dto.senha();
    }
}
