package br.com.vollmed.Api.model.medico;

public record DadosListagemMedico(
    Integer id,
    String nome,
    String email,
    String crm,
    Especialidade especialidade
) {
    
}
