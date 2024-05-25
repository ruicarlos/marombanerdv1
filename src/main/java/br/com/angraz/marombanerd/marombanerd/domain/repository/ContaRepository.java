package br.com.angraz.marombanerd.marombanerd.domain.repository;

import br.com.angraz.marombanerd.marombanerd.domain.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ContaRepository extends JpaRepository <Conta, Long> {

    Optional<Conta> findByEmail(String email);
    List<Conta> findByUsuarioContaining(String usuario);
    Conta findByEmailAndUsuario(String email, String usuario);
}
