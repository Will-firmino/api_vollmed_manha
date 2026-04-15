package br.com.vollmed.Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.vollmed.Api.model.medico.DadosCadastroMedico;
import br.com.vollmed.Api.model.medico.DadosListagemMedico;
import br.com.vollmed.Api.model.medico.Medico;
import br.com.vollmed.Api.model.medico.MedicoRepository;
import jakarta.transaction.Transactional;

@RestController // SPRING WEB - Informa para o SpringBoot que a classe é um controller(GET/POST/PUT/DELETE)
@RequestMapping("medicos") // SPRING WEB - Cria um caminho/endpoint para a classe abaixo.
public class MedicoController {

    @Autowired 
    private MedicoRepository medicoRepository;

    @PostMapping // SPRING WEB -Informa que o método é do tipo POST(CADASTRAR)
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados)); 
    }

    @GetMapping // SPRING WEB - Informa que o método é do tipo GET(LEITURA)
    public List<Medico> listar() {
        return medicoRepository.findAll();
    }

    // @GetMapping // SPRING WEB - Informa que o método é do tipo GET(LEITURA)
    // public List<DadosListagemMedico> listarMedicos() {

    // }

}
