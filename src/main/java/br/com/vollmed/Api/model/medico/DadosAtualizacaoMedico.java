package br.com.vollmed.Api.model.medico;

import br.com.vollmed.Api.model.endereco.DadosCadastroEndereco;

public record DadosAtualizacaoMedico(
    Integer id,
    String nome,
    String email,
    DadosCadastroEndereco endereco
) {
    
}
