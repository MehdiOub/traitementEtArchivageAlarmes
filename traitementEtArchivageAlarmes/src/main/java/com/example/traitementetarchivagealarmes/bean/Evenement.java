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
    private Date eventDate ;
   // private String codeAnomalie;
    @OneToMany
    private List<Anomalie> anomalies ;
    @OneToMany
    private List<Equipement> equipements ;
    private String libelleStation;
    @ManyToOne
    private Station station ;
    private String codeVoie;
    @ManyToOne
    private Voie voie ;

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

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public List<Anomalie> getAnomalies() {
        return anomalies;
    }

    public void setAnomalies(List<Anomalie> anomalies) {
        this.anomalies = anomalies;
    }

    public List<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    public String getLibelleStation() {
        return libelleStation;
    }

    public void setLibelleStation(String libelleStation) {
        this.libelleStation = libelleStation;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getCodeVoie() {
        return codeVoie;
    }

    public void setCodeVoie(String codeVoie) {
        this.codeVoie = codeVoie;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }
}
