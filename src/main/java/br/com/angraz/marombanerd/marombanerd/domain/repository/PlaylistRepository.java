package br.com.angraz.marombanerd.marombanerd.domain.repository;

import br.com.angraz.marombanerd.marombanerd.domain.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PlaylistRepository extends JpaRepository <Playlist, Long> {

    Optional<Playlist> findByContaAndListadodia(Long conta, String listadodia);
}
