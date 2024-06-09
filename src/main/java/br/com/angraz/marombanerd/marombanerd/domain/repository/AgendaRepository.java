package br.com.angraz.marombanerd.marombanerd.domain.repository;

import br.com.angraz.marombanerd.marombanerd.domain.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AgendaRepository extends JpaRepository <Agenda, Long> {

    Optional<Agenda> findByConta(Long conta);
}
