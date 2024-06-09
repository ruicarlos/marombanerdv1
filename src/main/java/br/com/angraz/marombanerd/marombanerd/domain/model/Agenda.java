package br.com.angraz.marombanerd.marombanerd.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Agenda {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int conta;
    private String opcao1domingo;
    private String opcao2domingo;
    private String opcao1segunda;
    private String opcao2segunda;
    private String opcao1terca;
    private String opcao2terca;
    private String opcao1quarta;
    private String opcao2quarta;
    private String opcao1quinta;
    private String opcao2quinta;
    private String opcao1sexta;
    private String opcao2sexta;
    private String opcao1sabado;
    private String opcao2sabado;
    private String status;

}
