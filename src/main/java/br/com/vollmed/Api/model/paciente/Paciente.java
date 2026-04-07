package br.com.vollmed.Api.model.paciente;

import br.com.vollmed.Api.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Entity 
@Table(name = "paciente")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Paciente {
    private int id;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;

}
