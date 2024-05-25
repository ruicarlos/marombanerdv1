package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.model.Metas;
import br.com.angraz.marombanerd.marombanerd.domain.repository.MetasRepository;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MetasController {

    @Autowired
    private MetasRepository metasRepository;

    @GetMapping("/metas")
    public List<Metas> listagem(){
        return metasRepository.findAll();
    }

    @GetMapping("/metas/{idMetas}")
    public ResponseEntity<Metas> buscaporId(@PathVariable Long idMetas){
        return metasRepository.findById(idMetas)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/metas/contaId/{contaMetas}")
    public List<Metas> buscaporConta(@PathVariable Long contaMetas){
        return metasRepository.findByConta(contaMetas);
    }

    @PostMapping("/metas")
    @ResponseStatus(HttpStatus.CREATED)
    public Metas add(@RequestBody Metas meta){
        return metasRepository.save(meta);
    }




}
