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
public class Perfil {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int conta;
    private String nome;
    private String foto;
    private int ponto;
    private int trofeus;
    private String tipoconta;
    private int tmb;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public int getPonto() {
        return ponto;
    }

    public void setTrofeus(int trofeus) {
        this.trofeus = trofeus;
    }

    public int getTrofeus() {
        return trofeus;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTmb(int tmb) {
        this.tmb = tmb;
    }

    public int getTmb() {
        return tmb;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
