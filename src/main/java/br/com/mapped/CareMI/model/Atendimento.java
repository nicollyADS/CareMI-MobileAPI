    package br.com.mapped.CareMI.model;

    import br.com.mapped.CareMI.dto.AtendimentoDto.AtualizacaoAtendimentoDto;
    import br.com.mapped.CareMI.dto.AtendimentoDto.CadastroAtendimentoDto;
    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import org.springframework.data.jpa.domain.support.AuditingEntityListener;
    import java.time.LocalDate;
    import java.util.List;

    @Getter
    @Setter
    @NoArgsConstructor

    @Entity
    @Table(name="atendimento")
    @EntityListeners(AuditingEntityListener.class)
    public class Atendimento {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atendimento")
        @SequenceGenerator(name = "atendimento", sequenceName = "seq_mobile_atendimento", allocationSize = 1)
        @Column(name="cdAtendimento", length = 9)
        private Long id;

        @Column(name="dsDescricao", length = 500, nullable = false)
        private String descricao;

        @Column(name="qtDias", length = 2, nullable = false)
        private String dias;

        @Column(name="dsHabito", length = 100, nullable = false)
        private String habito;

        @Column(name="dsTempoSono", length = 10, nullable = false)
        private String tempoSono;

        @Column(name="dsHereditario", length = 50, nullable = false)
        private String hereditario;

        @Column(name="dtEnvio", nullable = false)
        private String dataEnvio;



        public Atendimento(CadastroAtendimentoDto atendimentoDto) {
            descricao = atendimentoDto.descricao();
            dias = atendimentoDto.dias();
            habito = atendimentoDto.habito();
            tempoSono = atendimentoDto.tempoSono();
            hereditario = atendimentoDto.hereditario();
            dataEnvio = atendimentoDto.dataEnvio() ;
        }

        public void atualizarInformacoesAtendimento(AtualizacaoAtendimentoDto dto) {
            if (dto.descricao() != null)
                descricao = dto.descricao();
            if (dto.dias() != null)
                dias = dto.dias();
            if (dto.habito() != null)
                habito = dto.habito();
            if (dto.tempoSono() != null)
                tempoSono = dto.tempoSono();
            if (dto.hereditario() != null)
                hereditario = dto.hereditario();
            if (dto.dataEnvio() != null)
                dataEnvio = dto.dataEnvio();
        }
    }
