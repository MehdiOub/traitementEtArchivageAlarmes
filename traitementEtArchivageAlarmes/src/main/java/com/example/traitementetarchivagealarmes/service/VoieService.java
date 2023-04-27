package com.example.traitementetarchivagealarmes.service;

import com.example.traitementetarchivagealarmes.bean.Voie;
import com.example.traitementetarchivagealarmes.dao.VoieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoieService {
    @Autowired
    private VoieDao voieDao ;

    public Voie findByCodeWayAndStationId(String codeWay, Long id) {
        return voieDao.findByCodeWayAndStationId(codeWay, id);
    }

    public List<Voie> findByStationId(Long id) {
        return voieDao.findByStationId(id);
    }
}
