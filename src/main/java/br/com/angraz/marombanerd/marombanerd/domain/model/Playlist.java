package br.com.angraz.marombanerd.marombanerd.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Playlist {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int conta;
    private String listadodia;
    private String opcao1;
    private int opcao1id;
    private String opcao2;
    private int opcao2id;
    private String opcao3;
    private int opcao3id;
    private String opcao4;
    private int opcao4id;

}
