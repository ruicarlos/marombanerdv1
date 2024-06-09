package br.com.angraz.marombanerd.marombanerd.domain.repository;

import br.com.angraz.marombanerd.marombanerd.domain.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PerfilRepository extends JpaRepository <Perfil, Long> {

    Optional<Perfil> findByConta(Long conta);
    List<Perfil> findByNomeContaining(String nome);
    List<Perfil> findAllByTipoconta(String tipoconta);
    Perfil findByNomeAndPonto(String nome, int ponto);
}
