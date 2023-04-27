package com.example.traitementetarchivagealarmes.dao;

import com.example.traitementetarchivagealarmes.bean.Voie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoieDao extends JpaRepository<Voie,Long> {
    Voie findByCodeWayAndStationId(String codeWay , Long id);
    List<Voie> findByStationId(Long id) ;


}
