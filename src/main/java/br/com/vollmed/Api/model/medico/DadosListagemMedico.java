package br.com.vollmed.Api.model.medico;

public record DadosListagemMedico(
    Integer id,
    String nome,
    String email,
    String crm,
    Especialidade especialidade
) {

    // Método construtor recebendo o objeto Medico e convertendo para DadosListagemMedico.
    // Forma recente.
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
    
}
