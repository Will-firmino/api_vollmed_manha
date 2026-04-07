package br.com.vollmed.Api.model.consulta;

import br.com.vollmed.Api.model.medico.Medico;
import br.com.vollmed.Api.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "consulta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Consulta {
    private int id;
    // @OneToOne
    // @JoinColumn(name = "medico_id")
    private Medico medico;

    // @OneToOne
    // @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDate data;
    private LocalTime hora;
    private StatusConsulta statusConsulta;
    private int status;
}
