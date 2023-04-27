package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String codeEquipement ;
    private String libelle ;
    private String Description ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeEquipement() {
        return codeEquipement;
    }

    public void setCodeEquipement(String codeEquipement) {
        this.codeEquipement = codeEquipement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
