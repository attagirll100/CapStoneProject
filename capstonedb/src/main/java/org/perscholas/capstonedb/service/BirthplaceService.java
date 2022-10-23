package org.perscholas.capstonedb.service;

import org.perscholas.capstonedb.model.Birthplace;
import org.springframework.http.HttpStatus;

public interface BirthplaceService {

    Iterable<Birthplace> getPlaces();

    Birthplace createPlace(Birthplace birthplace);

    HttpStatus deletePlace(Long id);
}
