package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Evenement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Long idStation;
    private String codeVoie;
    private Date journeytDate ;
    private String typeVoie;
    private String messagetype;
    private String voieOperatonMode;
    private String telepeayage;
    private String eventType ;
    private Number numeroEqpt ;
    private String codeEvenement ;
    private String eventDetails ;
    @ManyToOne
    private Station station;
    @ManyToOne
    private Anomalie anomalie;
    private String codeAnomalie;
    @ManyToOne
    private Equipement eqpt ;
    @ManyToOne
    private Voie voie;
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

    public Long getIdStation() {
        return idStation;
    }

    public void setIdStation(Long idStation) {
        this.idStation = idStation;
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


    public String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    public String getVoieOperatonMode() {
        return voieOperatonMode;
    }

    public void setVoieOperatonMode(String voieOperatonMode) {
        this.voieOperatonMode = voieOperatonMode;
    }

    public String getTelepeayage() {
        return telepeayage;
    }

    public void setTelepeayage(String telepeayage) {
        this.telepeayage = telepeayage;
    }

    public Number getNumeroEqpt() {
        return numeroEqpt;
    }

    public void setNumeroEqpt(Number numeroEqpt) {
        this.numeroEqpt = numeroEqpt;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Anomalie getAnomalie() {
        return anomalie;
    }

    public void setAnomalie(Anomalie anomalie) {
        this.anomalie = anomalie;
    }

    public Equipement getEqpt() {
        return eqpt;
    }

    public void setEqpt(Equipement eqpt) {
        this.eqpt = eqpt;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public String getCodeVoie() {
        return codeVoie;
    }

    public void setCodeVoie(String codeVoie) {
        this.codeVoie = codeVoie;
    }
}
