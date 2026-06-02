package br.com.vollmed.Api.model.consulta;

import java.time.LocalDateTime;

import br.com.vollmed.Api.model.medico.Medico;
import br.com.vollmed.Api.model.paciente.Paciente;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "consultas")
@Entity
@Data
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String observacao;

    private Medico medico;
    private Paciente paciente;

    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private Status status;
}
