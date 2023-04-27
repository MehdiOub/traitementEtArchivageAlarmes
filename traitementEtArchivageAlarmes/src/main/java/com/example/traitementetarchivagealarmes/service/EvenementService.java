package com.example.traitementetarchivagealarmes.service;

import com.example.traitementetarchivagealarmes.bean.Evenement;
import com.example.traitementetarchivagealarmes.dao.EvenementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EvenementService {
    @Autowired
    private EvenementDao evenementDao ;

    public Evenement findByCodeEvenement(String codeEvenement) {
        return evenementDao.findByCodeEvenement(codeEvenement);
    }
    @Transactional
    public int deleteByCodeEvenement(String codeEvenement) {
        return evenementDao.deleteByCodeEvenement(codeEvenement);
    }

    public List<Evenement> findAll() {
        return evenementDao.findAll();
    }
}
