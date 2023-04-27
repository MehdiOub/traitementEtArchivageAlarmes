package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Anomalie {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codeAnomalie ;
    private String libelleAnomalie ;
    private String codeLibelleAnomalie ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeAnomalie() {
        return codeAnomalie;
    }

    public void setCodeAnomalie(String codeAnomalie) {
        this.codeAnomalie = codeAnomalie;
    }

    public String getLibelleAnomalie() {
        return libelleAnomalie;
    }

    public void setLibelleAnomalie(String libelleAnomalie) {
        this.libelleAnomalie = libelleAnomalie;
    }

    public String getCodeLibelleAnomalie() {
        return codeLibelleAnomalie;
    }

    public void setCodeLibelleAnomalie(String codeLibelleAnomalie) {
        this.codeLibelleAnomalie = codeLibelleAnomalie;
    }
}
