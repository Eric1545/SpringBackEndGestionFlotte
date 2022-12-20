package com.example.springbootbackend.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "v_assurance_avion")
public class VAssuranceAvion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "idassurance")
    private long idAssurance;

    @Column(name = "idavion")
    private long idAvion;

    @Column(name = "date_fin")
    private Date dateFin;

    @Column(name = "nom_assurance")
    private String nomAssurance;

    @Column(name = "matricule")
    private String matricule;

    public long getIdAssurance() {
        return idAssurance;
    }

    public void setIdAssurance(long idAssurance) {
        this.idAssurance = idAssurance;
    }

    public long getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(long idAvion) {
        this.idAvion = idAvion;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getNomAssurance() {
        return nomAssurance;
    }

    public void setNomAssurance(String nomAssurance) {
        this.nomAssurance = nomAssurance;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}