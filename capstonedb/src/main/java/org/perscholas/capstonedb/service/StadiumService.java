package org.perscholas.capstonedb.service;

import org.perscholas.capstonedb.model.Stadium;
import org.springframework.http.HttpStatus;

public interface StadiumService {
    Iterable<Stadium> getArenas();

    Stadium createArena(Stadium stadium);
    HttpStatus deleteArena(Long id);

}
