package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.model.Pontuacao;
import br.com.angraz.marombanerd.marombanerd.domain.repository.PontuacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PontuacaoController {

    @Autowired
    private PontuacaoRepository pontuacaoRepository;

    @GetMapping("/pontuacao/listagemporusuario/{idUser}")
    public List<Pontuacao> listagem(@PathVariable int idUser){
        return pontuacaoRepository.findAllByIduser(idUser);
    }

    @GetMapping("/pontuacao/somatorio/{idUser}")
    public int buscarporId(@PathVariable int idUser){
       // return pontuacaoRepository.sumByIduser(idUser);
        return pontuacaoRepository.somar(idUser);
    }

    @GetMapping("/pontuacao/{idPontuacao}")
    public ResponseEntity<Pontuacao> buscarporId(@PathVariable Long idPontuacao){
        return pontuacaoRepository.findById(idPontuacao
        )
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/pontuacao")
    @ResponseStatus(HttpStatus.CREATED)
    public Pontuacao addPontos(@RequestBody Pontuacao pontos){
        return pontuacaoRepository.save(pontos);
    }


}







