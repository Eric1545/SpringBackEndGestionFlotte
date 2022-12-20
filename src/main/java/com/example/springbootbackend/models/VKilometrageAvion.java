package com.example.springbootbackend.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "v_kilometrage_avion")
public class VKilometrageAvion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "idavion")
    private Integer  idAvion;

    @Column(name = " date_dep")
    private Date dateDep;

    @Column(name = "deb_km")
    private Float debKm;

    @Column(name = "fin_km")
    private Float finKm;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "image")
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Integer idAvion) {
        this.idAvion = idAvion;
    }

    public Date getDateDep() {
        return dateDep;
    }

    public void setDateDep(Date dateDep) {
        this.dateDep = dateDep;
    }

    public Float getDebKm() {
        return debKm;
    }

    public void setDebKm(Float debKm) {
        this.debKm = debKm;
    }

    public Float getFinKm() {
        return finKm;
    }

    public void setFinKm(Float finKm) {
        this.finKm = finKm;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
