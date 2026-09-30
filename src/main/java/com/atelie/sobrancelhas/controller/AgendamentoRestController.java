package com.atelie.sobrancelhas.controller;

import com.atelie.sobrancelhas.model.Agendamento;
import com.atelie.sobrancelhas.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoRestController {

    @Autowired
    private AgendamentoRepository repository;

    @PostMapping
    public ResponseEntity<Agendamento> salvarAgendamento(@RequestBody Agendamento agendamento) {
        Agendamento salvo = repository.save(agendamento);
        return ResponseEntity.ok(salvo);
    }
}
