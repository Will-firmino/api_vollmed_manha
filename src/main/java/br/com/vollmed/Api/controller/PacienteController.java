package br.com.vollmed.Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.vollmed.Api.model.paciente.DadosCadastroPaciente;
import br.com.vollmed.Api.model.paciente.DadosListagemPaciente;
import br.com.vollmed.Api.model.paciente.Paciente;
import br.com.vollmed.Api.model.paciente.PacienteRepository;
import jakarta.transaction.Transactional;

@RestController 
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    private void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        pacienteRepository.save(new Paciente(dados));
    }

    // Get que devolve todas as informações de todos os Pacientes.
    @GetMapping("listar")
    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();

    }

    // GET
   
    // PUT
    // DELETE


}

