package br.com.vollmed.Api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @PostMapping
    public void cadastrar(String dados){
        System.out.println(dados);
    }

}

