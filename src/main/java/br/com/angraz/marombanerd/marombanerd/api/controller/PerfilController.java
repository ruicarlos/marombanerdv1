package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.model.Perfil;
import br.com.angraz.marombanerd.marombanerd.domain.repository.MetasRepository;
import br.com.angraz.marombanerd.marombanerd.domain.repository.PerfilRepository;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfilController {

    @Autowired
    private PerfilRepository perfilRepository;

    @GetMapping("/perfil")
    public List<Perfil> listagem(){
        return perfilRepository.findAll();
    }

    @GetMapping("/perfil/{idConta}")
    public ResponseEntity<Perfil> buscaporId(@PathVariable Long idConta){
        return perfilRepository.findByConta(idConta)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/perfil/portipo/{tipo}")
    public List<Perfil> buscaporTipo(@PathVariable String tipo){
        return perfilRepository.findAllByTipoconta(tipo);
    }

    @PostMapping("/perfil")
    @ResponseStatus(HttpStatus.CREATED)
    public Perfil add(@RequestBody Perfil perfil){
        return perfilRepository.save(perfil);
    }




}
