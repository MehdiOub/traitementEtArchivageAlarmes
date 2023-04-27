package com.example.traitementetarchivagealarmes.service;

import com.example.traitementetarchivagealarmes.bean.Station;
import com.example.traitementetarchivagealarmes.dao.StationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StationService {
    @Autowired
    private StationDao stationDao ;

    public Station findByLibelle(String libelle) {
        return stationDao.findByLibelle(libelle);
    }
    @Transactional
    public int deleteByLibelle(String libelle) {
        return stationDao.deleteByLibelle(libelle);
    }
    public List<Station> findAll() {
        return stationDao.findAll();
    }
}
