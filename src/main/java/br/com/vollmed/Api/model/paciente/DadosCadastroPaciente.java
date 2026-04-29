package br.com.vollmed.Api.model.paciente;

import br.com.vollmed.Api.model.endereco.DadosCadastroEndereco;

public record DadosCadastroPaciente(
        String nome, 
        String email, 
        String telefone, 
        String cpf,
        DadosCadastroEndereco endereco
    ) {
    
}
