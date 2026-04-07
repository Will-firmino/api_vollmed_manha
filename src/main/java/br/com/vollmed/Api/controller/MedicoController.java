package br.com.vollmed.Api.controller;

import org.springframework.web.bind.annotation.*;

@RestController // SPRING WEB - Informa para o SpringBoot que a classe é um controller(GET/POST/PUT/DELETE)
@RequestMapping("medicos") // SPRING WEB - Cria um caminho/endpoint para a classe abaixo.
public class MedicoController {

    // métodos -> funções -> ações
    // GET

    // POST
    @PostMapping // SPRING WEB -Informa que o método é do tipo POST(CADASTRAR)
    public void cadastrar(String dados) {
        System.out.println(dados);
    }

    // PUT
    // DELETE
}
