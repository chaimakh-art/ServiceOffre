package com.iset.serviceoffreemploi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Offre {

    @Id
    @GeneratedValue
    private Long code;
    private String intitule;
    private String specialite;
    private String societe;
    private int nbpostes;
    private String pays;

    public Offre() {
    }

    public Offre(String intitule, String specialite, String societe, int nbpostes, String pays) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }

    // Getters
    public Long getCode() {
        return code;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getSpecialite() {
        return specialite;
    }

    public String getSociete() {
        return societe;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public String getPays() {
        return pays;
    }

    // Setters
    public void setCode(Long code) {
        this.code = code;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}