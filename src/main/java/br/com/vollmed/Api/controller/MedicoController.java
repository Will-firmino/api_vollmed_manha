package br.com.vollmed.Api.controller;

import org.springframework.web.bind.annotation.*;

import br.com.vollmed.Api.model.medico.DadosCadastroMedico;
import br.com.vollmed.Api.model.medico.MedicoRepository;

@RestController // SPRING WEB - Informa para o SpringBoot que a classe é um controller(GET/POST/PUT/DELETE)
@RequestMapping("medicos") // SPRING WEB - Cria um caminho/endpoint para a classe abaixo.
public class MedicoController {

    private MedicoRepository medicoRepository;

    @PostMapping // SPRING WEB -Informa que o método é do tipo POST(CADASTRAR)
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        // medicoRepository.save(new Medico(dados));9
        System.out.println(dados);
    }

}
