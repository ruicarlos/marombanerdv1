package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.exception.DomainExceptions;
import br.com.angraz.marombanerd.marombanerd.domain.model.Conta;
import br.com.angraz.marombanerd.marombanerd.domain.repository.ContaRepository;
import br.com.angraz.marombanerd.marombanerd.domain.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContaController {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ContaService contaService;

    @GetMapping("/contas")
    public List<Conta> Conta_listagem(){
        return contaRepository.findAll();
    }

    @GetMapping("/contas/{idConta}")
    public ResponseEntity<Conta> Conta_buscaporId(@PathVariable Long idConta){
       return contaRepository.findById(idConta)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/contas")
    @ResponseStatus(HttpStatus.CREATED)
    public Conta addconta(@RequestBody Conta conta){
      //  return  contaRepository.save(conta);
        return contaService.salvar(conta);
    }

    @PutMapping("/contas/{idConta}")
    public ResponseEntity<Conta> Conta_atualizar(@PathVariable Long idConta, @RequestBody Conta conta){
        if(!contaRepository.existsById(idConta)){
            return ResponseEntity.notFound().build();
        }
       return  ResponseEntity.ok().build();

    }


    @ExceptionHandler(DomainExceptions.class)
    public ResponseEntity<String> capturar(DomainExceptions e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
