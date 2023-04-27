package com.example.traitementetarchivagealarmes.bean;

import jakarta.persistence.*;

@Entity
public class Voie {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String way_code ;
    private  char way_type_code ;
    private int telepeageState ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWay_code() {
        return way_code;
    }

    public void setWay_code(String way_code) {
        this.way_code = way_code;
    }

    public char getWay_type_code() {
        return way_type_code;
    }

    public void setWay_type_code(char way_type_code) {
        this.way_type_code = way_type_code;
    }

    public int getTelepeageState() {
        return telepeageState;
    }

    public void setTelepeageState(int telepeageState) {
        this.telepeageState = telepeageState;
    }
}
