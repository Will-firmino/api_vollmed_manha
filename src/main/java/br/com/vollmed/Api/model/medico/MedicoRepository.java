package br.com.vollmed.Api.model.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MedicoRepository extends JpaRepository<Medico,Integer>{
    List<Medico> findByEmail(String email);

}
