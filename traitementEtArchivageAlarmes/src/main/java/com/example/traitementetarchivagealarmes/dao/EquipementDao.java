package com.example.traitementetarchivagealarmes.dao;

import com.example.traitementetarchivagealarmes.bean.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipementDao extends JpaRepository<Equipement,Long> {
    Equipement findByLibelle(String libelle);
    Equipement findByCodeEquipement(String codeEquipement);
    int deleteByLibelle(String libelle);
    int deleteByCodeEquipement(String codeEquipement);
    List<Equipement> findAll();
}
