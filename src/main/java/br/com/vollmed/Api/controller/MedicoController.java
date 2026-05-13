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

    // Get que devolve todas as informações de todos os Pacientes.
    @GetMapping("todos") // SPRING WEB - Informa que o método é do tipo GET(LEITURA)
    public List<Medico> listarTodos() {
        return medicoRepository.findAll();
    }

    //@GetMapping("listar") // SPRING WEB - Informa que o método é do tipo GET(LEITURA)
    //public List<DadosListagemMedico> listarRegraNegocio() {
        //return medicoRepository.findAll();
        // findAll() -> Método que retorna uma lista de objetos do tipo DadosListagemMedico.
        // stream() -> Método utilizado para transformar uma lista em um fluxo de dados, permitindo aplicar operações de transformação.
        // map() -> Método utilizado para converter cada objeto do tipo medico em um json Dados ListagemMedico, utilizando o construtor que criamos em DadosListamMedico.
        // toList() -> Método utilizado para coletar os resultados em uma nova lista do tipo DadosListagemMedico, que é o formato que queremos retornar para a API.
        // DadosListagemMedico::new -> é o construtor (método de referência) que está no record DadosListagemMedico.
    // }

        @PutMapping()
        @Transactional
        public void atualizar() {
            
        }
        






}
