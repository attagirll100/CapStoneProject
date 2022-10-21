package org.perscholas.capstonedb.service;

import org.perscholas.capstonedb.model.Stadium;
import org.perscholas.capstonedb.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StadiumServiceImpl implements StadiumService {
    @Autowired
    private StadiumRepository stadiumRepository;


    @Override
    public Iterable<Stadium> getArenas() { return stadiumRepository.findAll();
    }

    @Override
    public Stadium createArena(Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    @Override
    public HttpStatus deleteArena(Long id) {
        stadiumRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
