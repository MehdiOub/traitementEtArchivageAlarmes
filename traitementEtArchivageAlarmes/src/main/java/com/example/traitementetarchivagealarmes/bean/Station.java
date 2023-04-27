package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Station {
     @Id
     private Long id ;
     private String libelle ;
     @OneToMany
     private List<Voie> voies ;
     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getLibelle() {
          return libelle;
     }

     public void setLibelle(String libelle) {
          this.libelle = libelle;
     }

     public List<Voie> getVoies() {
          return voies;
     }

     public void setVoies(List<Voie> voies) {
          this.voies = voies;
     }
}
