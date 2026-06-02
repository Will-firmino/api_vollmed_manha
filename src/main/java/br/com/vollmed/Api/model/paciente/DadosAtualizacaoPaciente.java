package br.com.vollmed.Api.model.paciente;

import br.com.vollmed.Api.model.endereco.DadosCadastroEndereco;

public record DadosAtualizacaoPaciente(
    Integer id,
    String nome,
    String telefone,
    DadosCadastroEndereco endereco
) {
    
}
