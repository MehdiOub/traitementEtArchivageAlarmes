package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Evenement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String codeEvenement ;
    private String eventType ;
    private String eventDetails ;
    private Date journeytDate ;

    private String codeAnomalie;
    private String libelleStation;
    private Number codeEqpt ;
    private String codeVoie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeEvenement() {
        return codeEvenement;
    }

    public void setCodeEvenement(String codeEvenement) {
        this.codeEvenement = codeEvenement;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public Date getJourneytDate() {
        return journeytDate;
    }

    public void setJourneytDate(Date journeytDate) {
        this.journeytDate = journeytDate;
    }

    public String getCodeAnomalie() {
        return codeAnomalie;
    }

    public void setCodeAnomalie(String codeAnomalie) {
        this.codeAnomalie = codeAnomalie;
    }

    public String getLibelleStation() {
        return libelleStation;
    }

    public void setLibelleStation(String libelleStation) {
        this.libelleStation = libelleStation;
    }

    public Number getCodeEqpt() {
        return codeEqpt;
    }

    public void setCodeEqpt(Number codeEqpt) {
        this.codeEqpt = codeEqpt;
    }

    public String getCodeVoie() {
        return codeVoie;
    }

    public void setCodeVoie(String codeVoie) {
        this.codeVoie = codeVoie;
    }
}
