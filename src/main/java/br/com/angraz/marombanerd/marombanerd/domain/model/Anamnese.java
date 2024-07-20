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
public class Anamnese {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int conta;
    private String genero;
    private String nivel;
    private double altura;
    private double peso;
    private String dtnascimento;
    private String create_at;
    private int tmb;


}
