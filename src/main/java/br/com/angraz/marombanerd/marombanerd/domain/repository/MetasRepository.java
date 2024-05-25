package br.com.angraz.marombanerd.marombanerd.domain.repository;

import br.com.angraz.marombanerd.marombanerd.domain.model.Metas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public interface MetasRepository extends JpaRepository<Metas, Long> {

    List<Metas> findByConta(Long conta);
    List<Metas> findByContaAndCompleta(int conta, Boolean completa);
}
