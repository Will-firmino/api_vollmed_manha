package br.com.vollmed.Api.model.medico;


import br.com.vollmed.Api.model.endereco.Endereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        Endereco endereco
) {
    
}
// Essa clase é responsável por pegar os dados que estão vindo do simulador de requisição e transformar de json -> DTO <- em objeto para a API.
// A classe record já cria todos os getters, setters, constructors, hashcode e equals. Inclusive ja deixa todos os atributos privates. 



