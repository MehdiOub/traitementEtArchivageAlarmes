package com.example.traitementetarchivagealarmes.service;

import com.example.traitementetarchivagealarmes.bean.Anomalie;
import com.example.traitementetarchivagealarmes.dao.AnomalieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnomalieService {
    @Autowired
    private AnomalieDao anomalieDao ;

    public Anomalie findByLibelleAnomalie(String libelleAnomalie) {
        return anomalieDao.findByLibelleAnomalie(libelleAnomalie);
    }

    public Anomalie findByCodeAnomalie(String codeAnomalie) {
        return anomalieDao.findByCodeAnomalie(codeAnomalie);
    }
    @Transactional
    public int deleteByLibelleAnomalie(String libelleAnomalie) {
        return anomalieDao.deleteByLibelleAnomalie(libelleAnomalie);
    }
    @Transactional
    public int deleteByCodeAnomalie(String codeAnomalie) {
        return anomalieDao.deleteByCodeAnomalie(codeAnomalie);
    }

    public List<Anomalie> findAll() {
        return anomalieDao.findAll();
    }
}
