package org.perscholas.capstonedb.service;


import org.perscholas.capstonedb.model.Teams;
import org.springframework.http.HttpStatus;

public interface TeamsService {
    Iterable<Teams> getTeams();
    Teams createTeams(Teams teams);
    HttpStatus deleteTeams(Long id);



}
