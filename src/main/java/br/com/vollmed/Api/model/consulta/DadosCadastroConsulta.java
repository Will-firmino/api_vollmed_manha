package br.com.vollmed.Api.model.consulta;

import br.com.vollmed.Api.model.medico.Medico;
import br.com.vollmed.Api.model.paciente.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;

public record DadosCadastroConsulta(
        Medico medico,
        Paciente paciente,
        LocalDate data,
        LocalTime hora,
        StatusConsulta status
) {

}
