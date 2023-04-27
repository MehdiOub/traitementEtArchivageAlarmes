package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.*;

@Entity
public class Voie {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String wayCode ;
    private  char wayTypeCode ;
    private int telepeageState ;

    public Long getId() {
        return id;
    }

    public String getWayCode() {
        return wayCode;
    }

    public void setWayCode(String wayCode) {
        this.wayCode = wayCode;
    }

    public char getWayTypeCode() {
        return wayTypeCode;
    }

    public void setWayTypeCode(char wayTypeCode) {
        this.wayTypeCode = wayTypeCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTelepeageState() {
        return telepeageState;
    }

    public void setTelepeageState(int telepeageState) {
        this.telepeageState = telepeageState;
    }
}
