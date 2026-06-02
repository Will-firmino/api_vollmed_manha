package br.com.vollmed.Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.vollmed.Api.model.paciente.DadosAtualizacaoPaciente;
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
    @GetMapping("todos")
    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    @GetMapping("listar")
    public List<DadosListagemPaciente> listarRegraNegocio() {
        return pacienteRepository.findAll().stream()
                .filter(Paciente::getAtivo)
                .map(DadosListagemPaciente::new)
                .toList();
    }

    @PutMapping("atualizar")
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoPaciente dados) {
        var paciente = pacienteRepository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping("deletar/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id) {
        pacienteRepository.deleteById(id);

    }

    @DeleteMapping("alterar-status/{id}")
    @Transactional
    public void alterarStatus(@PathVariable Integer id) {
        var paciente = pacienteRepository.getReferenceById(id);
        paciente.exclusaoLogica();
    }



}

