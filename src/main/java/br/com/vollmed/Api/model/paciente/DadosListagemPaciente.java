package br.com.vollmed.Api.model.paciente;

public record DadosListagemPaciente(
    Integer id,
    String nome,
    String email,
    String telefone,
    String cpf
) {
    
}
