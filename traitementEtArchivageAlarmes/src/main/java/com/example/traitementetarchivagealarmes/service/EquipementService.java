package com.example.traitementetarchivagealarmes.service;

import com.example.traitementetarchivagealarmes.bean.Equipement;
import com.example.traitementetarchivagealarmes.dao.EquipementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipementService {
    @Autowired
    private EquipementDao equipementDao ;

    public Equipement findByLibelle(String libelle) {
        return equipementDao.findByLibelle(libelle);
    }

    public Equipement findByCodeEquipement(String codeEquipement) {
        return equipementDao.findByCodeEquipement(codeEquipement);
    }
    @Transactional
    public int deleteByLibelle(String libelle) {
        return equipementDao.deleteByLibelle(libelle);
    }
    @Transactional
    public int deleteByCodeEquipement(String codeEquipement) {
        return equipementDao.deleteByCodeEquipement(codeEquipement);
    }

    public List<Equipement> findAll() {
        return equipementDao.findAll();
    }
}
