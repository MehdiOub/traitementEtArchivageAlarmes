package com.example.traitementetarchivagealarmes.dao;

import com.example.traitementetarchivagealarmes.bean.Anomalie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnomalieDao extends JpaRepository<Anomalie,Long> {
     Anomalie findByLibelleAnomalie(String libelleAnomalie);
     Anomalie findByCodeAnomalie(String codeAnomalie);
     int deleteByLibelleAnomalie(String libelleAnomalie);
     int deleteByCodeAnomalie(String codeAnomalie);

     List<Anomalie> findAll();

}
