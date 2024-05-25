package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.model.Anamnese;
import br.com.angraz.marombanerd.marombanerd.domain.repository.AnamneseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnamneseController {

    @Autowired
    private AnamneseRepository anamneseRepository;

    @GetMapping("/anamnese")
    public List<Anamnese> listagem(){
        return anamneseRepository.findAll();
    }

    @GetMapping("/anamnese/{idAnamnese}")
    public ResponseEntity<Anamnese> buscarporId(@PathVariable Long idAnamnese){
        return anamneseRepository.findById(idAnamnese)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/anamnese")
    @ResponseStatus(HttpStatus.CREATED)
    public Anamnese addAnamnese(@RequestBody Anamnese anamnese){
        return anamneseRepository.save(anamnese);
    }

    @PutMapping("/anamnese/{idAnamnese}")
    public ResponseEntity<Anamnese> atualizar(@PathVariable Long idAnamnese, @RequestBody Anamnese anamnese){
        if(!anamneseRepository.existsById(idAnamnese)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

}







