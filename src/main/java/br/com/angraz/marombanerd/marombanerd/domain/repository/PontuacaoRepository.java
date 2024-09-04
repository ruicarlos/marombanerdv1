package br.com.angraz.marombanerd.marombanerd.domain.repository;

import br.com.angraz.marombanerd.marombanerd.domain.model.Perfil;
import br.com.angraz.marombanerd.marombanerd.domain.model.Pontuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PontuacaoRepository extends JpaRepository <Pontuacao, Long> {

    //Optional<Pontuacao> findByIduser(Long iduser);

    @Query(value = "select sum(PONTOS)as pontos from pontuacao where iduser = ?1", nativeQuery= true)
    int somar(int iduser );

    List<Pontuacao> findAllByIduser(int iduser);
}
