package org.perscholas.capstonedb.service;

import org.perscholas.capstonedb.model.Basketballplayers;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface BasketballplayersService {
     Iterable<Basketballplayers> getPlayers();

     Basketballplayers createPlayers(Basketballplayers basketballplayers);
     HttpStatus deletePlayers(Long id);

}
