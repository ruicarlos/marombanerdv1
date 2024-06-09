package br.com.angraz.marombanerd.marombanerd.api.controller;

import br.com.angraz.marombanerd.marombanerd.domain.model.Playlist;
import br.com.angraz.marombanerd.marombanerd.domain.repository.MetasRepository;
import br.com.angraz.marombanerd.marombanerd.domain.repository.PerfilRepository;
import br.com.angraz.marombanerd.marombanerd.domain.repository.PlaylistRepository;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaylistController {

    @Autowired
    private PlaylistRepository playlistRepository;

    @GetMapping("/playlist")
    public List<Playlist> listagem(){
        return playlistRepository.findAll();
    }

    @GetMapping("/playlist/{idConta}/{listadodia}")
    public ResponseEntity<Playlist> buscaporIdeDia(@PathVariable Long idConta, @PathVariable String listadodia){
        return playlistRepository.findByContaAndListadodia(idConta, listadodia)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



    @PostMapping("/playlist")
    @ResponseStatus(HttpStatus.CREATED)
    public Playlist add(@RequestBody Playlist playlist){
        return playlistRepository.save(playlist);
    }




}
