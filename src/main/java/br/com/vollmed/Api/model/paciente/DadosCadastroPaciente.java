package br.com.vollmed.Api.model.paciente;

import br.com.vollmed.Api.model.endereco.Endereco;

public record DadosCadastroPaciente(String nomeCompleto, String email, String telefone, String cpf, Endereco endereco) {
    
}
