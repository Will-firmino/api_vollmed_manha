package br.com.vollmed.Api.model.consulta;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
    Integer medicoId,
    Integer pacienteId,
    String observacao,
    Status status,
    LocalDateTime data
) {
    // Id do médico
    // Id do Paciente
    // Obs ?
    // Status
    

}

// O Id do agendamento é automático.
// o LodalDateTime também é automático.
