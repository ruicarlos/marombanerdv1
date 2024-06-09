package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.model.Agenda;
import br.com.angraz.marombanerd.marombanerd.domain.repository.AgendaRepository;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    @GetMapping("/agenda")
    public List<Agenda> listagem(){
        return agendaRepository.findAll();
    }

    @GetMapping("/agenda/{idConta}")
    public ResponseEntity<Agenda> buscaporId(@PathVariable Long idConta){
        return agendaRepository.findByConta(idConta)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/agenda")
    @ResponseStatus(HttpStatus.CREATED)
    public Agenda add(@RequestBody Agenda agenda){
        return agendaRepository.save(agenda);
    }




}
