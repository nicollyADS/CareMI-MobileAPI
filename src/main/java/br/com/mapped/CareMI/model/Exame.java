package br.com.mapped.CareMI.model;

import br.com.mapped.CareMI.dto.ExameDto.AtualizacaoExameDto;
import br.com.mapped.CareMI.dto.ExameDto.CadastroExameDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="exame")
@EntityListeners(AuditingEntityListener.class)
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exame")
    @SequenceGenerator(name = "exame", sequenceName = "seq_mobile_exame", allocationSize = 1)
    @Column(name="cdExame", length = 9)
    private Long id;

    @Column(name="dtExame", nullable = false)
    private String data;

    @Column(name="hrExame", nullable = false)
    private String hora;

    @Column(name="dsExame", length = 500, nullable = false)
    private String descricao;


    public Exame(CadastroExameDto exameDto) {
        data = exameDto.data();
        hora = exameDto.hora();
        descricao = exameDto.descricao();
    }

    public void atualizarInformacoesExame(AtualizacaoExameDto dto) {
        if (dto.data() != null)
            data = dto.data();
        if (dto.hora() != null)
            hora = dto.hora();
        if (dto.descricao() != null)
            descricao = dto.descricao();
    }
}