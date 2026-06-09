package br.com.vollmed.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vollmed.Api.model.consulta.Consulta;
import br.com.vollmed.Api.model.consulta.ConsultaRepository;
import br.com.vollmed.Api.model.consulta.DadosAgendamentoConsulta;
import br.com.vollmed.Api.model.medico.MedicoRepository;
import br.com.vollmed.Api.model.paciente.PacienteRepository;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    // Método para agendar uma consulta
    @PostMapping
    public Consulta agendar(@RequestBody DadosAgendamentoConsulta dados){
        // Preciso agendar com um médico
        var medico = medicoRepository.getReferenceById(dados.medicoId());
        // Preciso agendar para um paciente
        var paciente = pacienteRepository.getReferenceById(dados.pacienteId());

        // Agendar a consulta
        var consulta = new Consulta(dados);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);

        return consultaRepository.save(consulta);



    }


    


}
