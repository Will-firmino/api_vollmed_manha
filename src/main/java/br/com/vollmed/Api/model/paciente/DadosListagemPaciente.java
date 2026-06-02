package br.com.vollmed.Api.model.paciente;

public record DadosListagemPaciente(
    Integer id,
    String nome,
    String email,
    String cpf
) {

    // Método construtor recebendo o objeto Paciente e convertendo para DadosListagemPaciente.
    // Forma recente.
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
    
}
