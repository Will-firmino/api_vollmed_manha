package br.com.vollmed.Api.model.consulta;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Data;

import br.com.vollmed.Api.model.medico.Medico;
import br.com.vollmed.Api.model.paciente.Paciente;

@Table(name = "consultas")
@Entity
@Data
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String observacao;

    @JoinColumn(name = "medicoId")
    @ManyToOne
    private Medico medico;

    @JoinColumn(name = "pacienteId")
    @ManyToOne
    private Paciente paciente;

    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private Status status;

    // Terceiro construtor da classe Consulta que recebe a conversão que a record DadosAgendamentoConsulta está realizando
    // Json -> OBJ(dict)
    // O this.medico = new Medico() cria um objeto de médico vazio. Quando você tentar inserir o id nesse novo medico criado, ele irá receber e o banco de dados saberá que aquele id já existe e trará as informações do médico com aquele id passado.
    public Consulta(DadosAgendamentoConsulta dados) {
        this.medico = new Medico();
        this.medico.setId(dados.medicoId());
        this.paciente = new Paciente();
        this.paciente.setId(dados.pacienteId());
        this.status = dados.status();
        this.observacao = dados.observacao();
        this.data = dados.data();
    }


}
