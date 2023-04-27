package com.example.traitementetarchivagealarmes.dao;

import com.example.traitementetarchivagealarmes.bean.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationDao extends JpaRepository<Station,Long> {
    Station findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    List<Station> findAll();
}
