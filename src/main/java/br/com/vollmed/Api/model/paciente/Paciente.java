package br.com.vollmed.Api.model.paciente;

import jakarta.persistence.*;
import lombok.*;

@Entity 
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    // private Endereco endereco;

}
