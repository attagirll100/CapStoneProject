package org.perscholas.capstonedb.service;

import org.perscholas.capstonedb.model.Basketballplayers;
import org.perscholas.capstonedb.model.Teams;
import org.perscholas.capstonedb.repository.BasketballplayersRepository;
import org.perscholas.capstonedb.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TeamsServiceImpl implements TeamsService {
    @Autowired
    private TeamsRepository teamsRepository;

    @Override
    public Iterable<Teams> getTeams() {
        return teamsRepository.findAll();
    }

    @Override
    public Teams createTeams(Teams teams) {
        return teamsRepository.save(teams);
    }

    @Override
    public HttpStatus deleteTeams(Long id) {
        teamsRepository.deleteById(id);
        return HttpStatus.OK;
    }
}







