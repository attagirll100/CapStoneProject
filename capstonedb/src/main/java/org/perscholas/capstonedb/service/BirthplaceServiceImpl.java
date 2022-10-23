package org.perscholas.capstonedb.service;


import org.perscholas.capstonedb.model.Birthplace;
import org.perscholas.capstonedb.repository.BirthplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BirthplaceServiceImpl implements BirthplaceService {
    @Autowired
    private BirthplaceRepository birthplaceRepository;


    @Override
    public Iterable<Birthplace> getPlaces() {
        return birthplaceRepository.findAll();
    }

    @Override
    public Birthplace createPlace(Birthplace birthplace) {
        return birthplaceRepository.save(birthplace);
    }

    @Override
    public HttpStatus deletePlace(Long id) {
        birthplaceRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
