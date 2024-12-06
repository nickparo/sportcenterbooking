package com.sportcenter.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CampoSportivo {

     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String disciplina;
    private boolean dispobibile;
    private double costoOrario;

    @OneToMany
    (mappedBy = "campoSportivo")
    private List <Prenotazione>prenotazioni;


    public Long getId() {
        return id;
    }public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public boolean isDispobibile() {
        return dispobibile;
    }
    public void setDispobibile(boolean dispobibile) {
        this.dispobibile = dispobibile;
    }
    public double getCostoOrario() {
        return costoOrario;
    }
    public void setCostoOrario(double costoOrario) {
        this.costoOrario = costoOrario;
    }
    
}
