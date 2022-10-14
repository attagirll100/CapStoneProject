package org.perscholas.capstonedb.service;

import org.perscholas.capstonedb.model.Basketballplayers;
import org.perscholas.capstonedb.repository.BasketballplayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketballplayersImpl implements BasketballplayersService {
    @Autowired
    private BasketballplayersRepository basketballplayersRepository;

    @Override
    public Iterable<Basketballplayers> getPlayers() {
        return basketballplayersRepository.findAll();
    }

    @Override
    public Basketballplayers createPlayers(Basketballplayers basketballplayers) {
        return basketballplayersRepository.save(basketballplayers);
    }

    @Override
    public HttpStatus deletePlayers(Long id) {
        basketballplayersRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
