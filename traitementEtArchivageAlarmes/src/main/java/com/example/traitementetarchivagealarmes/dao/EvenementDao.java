package com.example.traitementetarchivagealarmes.dao;

import com.example.traitementetarchivagealarmes.bean.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenementDao extends JpaRepository<Evenement,Long> {
    Evenement findByCodeEvenement(String codeEvenement);
    int deleteByCodeEvenement(String codeEvenement);
    List<Evenement> findAll();
}
